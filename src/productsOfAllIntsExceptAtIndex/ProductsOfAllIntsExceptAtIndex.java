package productsOfAllIntsExceptAtIndex;

/*
You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
Write a function getProductsOfAllIntsExceptAtIndex() that takes an array of integers and returns an array of the products.

For example, given:

  [1, 7, 3, 4]

your function would return:

  [84, 12, 28, 21]

by calculating:

  [7*3*4, 1*3*4, 1*7*4, 1*7*3]

Do not use division in your solution.
 */


public class ProductsOfAllIntsExceptAtIndex {

	public void getProductsOfAllIntsExceptAtIndex(int[] arr)
	{
		int[] tempArr=new int[arr.length];
		
		tempArr[arr.length-1]=1;
	
		int i=arr.length-2;
		
		for(int j=arr.length-1;j>=1;j--)
		{
			tempArr[i]=tempArr[i+1]*arr[j];
			i--;		
		}
		
		int temp=1;
		
		for(int j=1;j<arr.length;j++)
		{
			temp=temp*arr[j-1];
			tempArr[j]=tempArr[j]*temp;
			
		}
		
		for(int k=0;k<tempArr.length;k++)
		{
			System.out.println(tempArr[k]);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={3,1,2,5,6,4};
		ProductsOfAllIntsExceptAtIndex atIndex=new ProductsOfAllIntsExceptAtIndex();
		atIndex.getProductsOfAllIntsExceptAtIndex(arr);
	}
	
}
