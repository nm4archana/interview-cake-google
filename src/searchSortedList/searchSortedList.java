package searchSortedList;

/*
Suppose we had an array ↴ of nn integers in sorted order. How quickly could we check if a given integer is in the array?
*/

public class searchSortedList {

	public Boolean searchInSortedArr(int[] arr,int start,int end,int searchElement)
	{	
		int mid=(start+end)/2;
		
		if(arr[mid]==searchElement)
		{
			return true;
		}
		if(start==end)
		{
			return false;
		}
		
		if(arr[mid]<searchElement)
		{
			return searchInSortedArr(arr,mid+1,end,searchElement);
		}
		else  
		{
			return searchInSortedArr(arr,start,mid-1,searchElement);
		}	
	}
	
	public static void main(String[] args)
	{
		int[] a={1,5,6,7,10};
		
		searchSortedList list=new searchSortedList();
		
		Boolean flag=list.searchInSortedArr(a, 0, a.length-1, 19);
		
		if(flag==true)
		{
			System.out.println("The element is present in the given array");
		}
		else
		{
			System.out.println("The element is not present in the goven array");
		}
		
	}
	
}
