package appearsTwice;

public class appearsTwice
{

    public int AppearsTwice(int n,int[] arr)
    {
    	int Nsum=n*(n+1)/2;
    	
    	int arrSum=0;
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		arrSum=arrSum+arr[i];
    	}
    	
    	return arrSum-Nsum;
    }	
    
    public static void main(String[] args)
    {
      int[] a={5,1,2,7,6,3,4,5};	
      
      appearsTwice twice=new appearsTwice();
      
      System.out.println("The number that appears twice in the array is: "+twice.AppearsTwice(7, a));
    }
	
}
