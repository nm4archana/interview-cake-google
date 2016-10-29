package inPlaceShuffle;

import java.util.Random;

public class InPlaceShuffle 
{

	 public int[] inPlaceShuffle(int[] n)
	 {
		 for(int i=0;i<n.length-1;i++)
		 {
			 int randomIndex=getRandom(i,n.length-1);
			 
			 int temp= n[randomIndex];
			 n[randomIndex]=n[i];
			 n[i]=temp;
		 }
		 
		 return n;
	 }

	 public int getRandom(int floor,int ceiling)
	 {
		 Random rand = new Random();
		 return rand.nextInt((ceiling - floor)+1)+floor;
		 
	 }
	 
	 public static void main(String[] args)
	 {
		 int[] n={1,2,3,4,5,6,7};
		 InPlaceShuffle inPlaceShuffle=new InPlaceShuffle();
		  int[] k=inPlaceShuffle.inPlaceShuffle(n);
		  
		  for(int i=0;i<k.length;i++)
		  {
			  System.out.println(k[i]);
		  }
	 }
	
}
