package singleRiffleShuffle;

/*
 I figured out how to get rich: online poker.
I suspect the online poker game I'm playing shuffles cards by doing a single " riffle ↴ ."

To prove this, let's write a function to tell us if a full deck of cards shuffledDeck is a single riffle of two other halves half1 and half2.

We'll represent a stack of cards as an array of integers in the range 
1..52 (since there are 52 distinct cards in a deck).

Why do I care? A single riffle is not a completely random shuffle. If I'm right, 
I can make more informed bets and get rich and finally prove to my ex that I am not a 
"loser with an unhealthy cake obsession" (even though it's too late now because she 
let me go and she's never getting me back).
*/


public class singleRiffleShuffle
{
   public Boolean isSingleRiffleShuffle(int[] half1,int[] half2,int[] arr,int half1Index,
		   int half2Index,int arrIndex)
   {
	   if(arrIndex==arr.length)
	   {
		   return true;
	   }
	   
	  if(half1Index<half1.length&&arr[arrIndex]==half1[half1Index])
	  {
		  half1Index=half1Index+1;
	  }
	  else if(half2Index<half2.length&&arr[arrIndex]==half2[half2Index])
	  {
		  half2Index=half2Index+1;
	  }
	  else
	  {
		  return false;
	  }
	return isSingleRiffleShuffle(half1,half2,arr,half1Index,half2Index,arrIndex+1);
   }
   	
   public static void main(String[] args)
   {
	   int[] arr1={1,2,3,5,7,9};
	   int[] arr2={4,6,8,10};
	   
	   int[] arr={1,2,3,4,6,5,7,8,10,9};
	   
	   singleRiffleShuffle riffleShuffle=new singleRiffleShuffle();
	   
	   if(riffleShuffle.isSingleRiffleShuffle(arr1, arr2, arr, 0, 0, 0))
	   {
		   System.out.println("The cards are shuffled by single riffle");
	   }
	   else
	   {
		   System.out.println("The cards are not shuffled by single riffle");
	   }
   }
	
}
