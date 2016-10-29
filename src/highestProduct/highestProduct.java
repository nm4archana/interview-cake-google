package highestProduct;

/*
Given an arrayOfInts, find the highestProduct you can get from three of the integers.
The input arrayOfInts will always have at least three integers.
 */
 


public class highestProduct {

	public int highestProductOfThreeIntegers(int[] arr)
	{
		int lowest=Math.min(arr[0],arr[1]);
		int highest=Math.max(arr[0],arr[1]);
		int lowestProd2=arr[0]*arr[1];
		int highestProd2=arr[0]*arr[1];
		int highestProd3= arr[0]*arr[1]*arr[2];
		
		for(int i=2;i<arr.length;i++)
		{
			int current=arr[i];
			highestProd3=Math.max(highestProd3,Math.max(current*lowestProd2,current*highestProd2));
			highestProd2=Math.max( highestProd2,Math.max(current*highest,current*lowest));
			lowestProd2=Math.min(lowestProd2,Math.min(current*lowest,current*highest));
			
			lowest=Math.min(current, lowest);
			highest=Math.max(current, highest);
		}
		
		return highestProd3;
	}
	
	public static void main(String[] args)
	{
		int[] arr={10,-70,1,2,-3};
		//int[] arr={1, 10, -5, 1, -100};
		
		highestProduct product=new highestProduct();
		
		System.out.println("The highest product of three integers in an array is: "+product.highestProductOfThreeIntegers(arr));
	}
	
}
