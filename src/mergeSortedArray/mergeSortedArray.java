package mergeSortedArray;

/*
 In order to win the prize for most cookies sold, my friend Alice and I are going to merge our Girl Scout Cookies orders and enter as one unit.
Each order is represented by an "order id" (an integer).

We have our lists of orders sorted numerically already, in arrays. Write a function to merge our arrays of orders into one sorted array.

For example:

  int[] myArray     = new int[]{3, 4, 6, 10, 11, 15};
int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

System.out.println(mergeArrays(myArray, alicesArray));
// prints [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]


 */
public class mergeSortedArray 
{

	public int[] mergeSortedArrays(int[] arr1,int[] arr2)
	{
		
		int i=0,j=0,k=0;
		
		int[] tempArr=new int[arr1.length+arr2.length];
		
	    while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				tempArr[k]=arr1[i];
				i++;
			}
			else
			{
				tempArr[k]=arr2[j];
				j++;
			}
			
			k++;
		}
		
		if(i==arr1.length)
		{
			for(int l=j;l<arr2.length;l++)
			{
				tempArr[k]=arr2[l];
				k++;
			}
		}
		else 
		if(j==arr2.length)
		{
			for(int m=i;m<arr1.length;m++)
			{
				tempArr[k]=arr2[m];
				k++;
			}	
		}
	
		return tempArr;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr1={3, 4, 6, 10, 11, 15};
		int[] arr2={1, 5, 8, 12, 14, 19};
		mergeSortedArray array=new mergeSortedArray();
		int[] resultArr=array.mergeSortedArrays(arr1, arr2);
		
		for(int i=0;i<resultArr.length;i++)
		{
			System.out.println(resultArr[i]);
		}
	}
}
