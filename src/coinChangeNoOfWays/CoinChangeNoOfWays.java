package coinChangeNoOfWays;

/*
Imagine you landed a new job as a cashier...
Your quirky boss found out that you're a programmer and has a weird request about something they've been wondering for a long time.

Write a function that, given:

an amount of money
an array of coin denominations
computes the number of ways to make amount of money with coins of the available denominations.

Example: for amount=44 (44¢) and denominations=[1,2,3][1,2,3] (11¢, 22¢ and 33¢), your program would output 44—the number of ways to make 44¢ with those denominations:

1¢, 1¢, 1¢, 1¢
1¢, 1¢, 2¢
1¢, 3¢
2¢, 2¢
*/


public class CoinChangeNoOfWays 
{
	public int coinChangeNoOfWays(int[] arr,int total)
	{
		int[][] tempArr=new int[arr.length][total+1];
		
		for(int i=0;i<arr.length;i++)
		{
			tempArr[i][0]=1;
		}
		
		for(int j=1;j<=total;j++)
		{
			tempArr[0][j]=1;
		}
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=1;j<=total;j++)
			{
				if(j<arr[i])
				{
					tempArr[i][j]=tempArr[i-1][j];
				}
				else
				{
					tempArr[i][j]=tempArr[i-1][j]+tempArr[i][j-arr[i]];
				}
			}
		}
		return tempArr[arr.length-1][total];
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,2,3};
		CoinChangeNoOfWays noOfWays=new CoinChangeNoOfWays();
	    System.out.println("The number of ways the coins can be arranged to form the total is: "+
		noOfWays.coinChangeNoOfWays(arr, 4));	
	}
}
