package inFlightEntertainment;

/*
You've built an in-flight entertainment system with on-demand movie streaming.
Users on longer flights like to start a second movie right when their first one ends, but they complain that the plane usually lands before they can see the ending. So you're building a feature for choosing two movies whose total runtimes will equal the exact flight length.

Write a function that takes an integer flightLength (in minutes) and an array of integers movieLengths (in minutes) and returns a boolean indicating whether there are two numbers in movieLengths whose sum equals flightLength.

When building your function:

Assume your users will watch exactly two movies
Don't make your users watch the same movie twice
Optimize for runtime over memory

 */

import java.util.HashSet;
import java.util.Set;

public class inFlightEntertainment {

	public Boolean InFlightEntertainment(int[] arr,int flightTime)
	{
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
			{
				return true;
			}
			else
			{
				set.add(flightTime-arr[i]);
			}
		}
		return false;
	}
	
	
	public static void main(String[] args)
	{
		int arr[]={1,3,12,6,5,4};
		
		inFlightEntertainment entertainment=new inFlightEntertainment();
		
		Boolean flag=entertainment.InFlightEntertainment(arr, 11);
		
		if(flag==true)
		{
			System.out.println("Two movies with the given flight time is available");
		}
		else
		{
			System.out.println("Two movies with the given flight time is not available");
		}
	}
}
