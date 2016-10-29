package appleStocks;

/*
Writing programming interview questions hasn't made me rich. Maybe trading Apple stocks will.
Suppose we could access yesterday's stock prices as an array, where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500.

Write an efficient function that takes stockPricesYesterday and returns the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

For example:

  int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};

getMaxProfit(stockPricesYesterday);
// returns 6 (buying for $5 and selling for $11)

No "shorting"—you must buy before you sell. You may not buy and sell in the same time step (at least 1 minute must pass).
 */


public class appleStock {

	//My method-O(n)
	public int getMaxProfit(int[] stockPricesYesterday)
	{
		int smallestInteger=0;
		int largestInteger=0;
		
		int i=0,j=stockPricesYesterday.length-2;
		
		//To find the smallest integer
		while(i!=j)
		{
			if(stockPricesYesterday[i]>stockPricesYesterday[j])
			{
				i=i+1;
			}
			else
			{
				j=j-1;
			}
		}
		 smallestInteger=stockPricesYesterday[i];
		 
		 i=i+1;
		 j=stockPricesYesterday.length-1;
		 
		 while(i!=j)
		 {
			 if(stockPricesYesterday[i]>stockPricesYesterday[j])
				{
					j=j-1;
				}
				else
				{
					i=i+1;
				}
		 }
		 
		
		 largestInteger=stockPricesYesterday[i];
		
		return largestInteger-smallestInteger;
		
	}
	
	//InterviewCakeSolution
	//If maxProfit is initialized just zero, then the maxprofit will remain zero even if there is a negative profit.
	//Hence it is assigned to stockPricesYesterday[0]
	public int getMaxProft(int[] stockPricesYesterday)
	{
		int minPrice=stockPricesYesterday[0];
		int maxProfit=stockPricesYesterday[1] - stockPricesYesterday[0];;
		
		for(int i=1;i<stockPricesYesterday.length;i++)
		{
			  int currentPrice = stockPricesYesterday[i];
			 
			  int potentialProfit = currentPrice - minPrice;

			  maxProfit = Math.max(maxProfit, potentialProfit);
		
			  minPrice = Math.min(minPrice, currentPrice);
	}
	return maxProfit;
	}
	
    public static void main(String[] args)
    {
    	int[] stockPricesYesterday={10, 7, 5, 10};
    	appleStock appleStock=new appleStock();
    	System.out.println(appleStock.getMaxProfit(stockPricesYesterday));
    	System.out.println(appleStock.getMaxProft(stockPricesYesterday));
    }
}






//O(nlogn) solution

/*for(int i=0;i<stockPricesYesterday.length-1;i++)
{
	for(int k=i+1;k<stockPricesYesterday.length;k++)
	{
		if(stockPricesYesterday[k]-stockPricesYesterday[i]>maxEndingHere)
		{
			maxEndingHere=stockPricesYesterday[k]-stockPricesYesterday[i];
		}
	}
}*/