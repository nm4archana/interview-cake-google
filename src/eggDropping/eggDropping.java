package eggDropping;

/*
A building has 100 floors. One of the floors is the highest floor an egg can be dropped from without breaking.
If an egg is dropped from above that floor, it will break. If it is dropped from that floor or below, it will be completely undamaged and you can drop the egg again.

Given two eggs, find the highest floor an egg can be dropped from without breaking, with as few drops as possible.
*/

public class eggDropping 
{
     
	public int EggDropping(int noOfEggs,int noOfFloors)
	{
		int[][] tempArr=new int[noOfEggs+1][noOfFloors+1];
		
		for(int j=0;j<noOfFloors;j++)
		{
			tempArr[1][j]=j;
		}
		
		for(int i=2;i<=noOfEggs;i++)
		{
			for(int j=1;j<=noOfFloors;j++)
			{
				tempArr[i][j]=Integer.MAX_VALUE;
				
				for(int k=1;k<=j;k++)
				{
					int count=1+Math.max(tempArr[i-1][k-1],tempArr[i][j-k]);
					
					if(count<tempArr[i][j])
					{
						tempArr[i][j]=count;
					}
				}
			}
		}
		
		return tempArr[noOfEggs][noOfFloors];
	}
	
	
	public static void main(String[] args)
	{
	
		eggDropping dropping=new eggDropping();
		
		System.out.println("The total number of drops to find the highest floor from where egg can be dropped without breaking is: "+dropping.EggDropping(2, 100));
	}
	
}
