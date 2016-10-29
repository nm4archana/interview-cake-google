package chkPalindromePermutation;
import java.util.HashSet;
import java.util.Set;

/*
 Write an efficient function that checks whether any permutation ↴
A permutation is an ordering of a set of items.

Example: all permutations of 'tom':

tom
tmo
omt
otm
mto
mot
Not to be confused with a combination, which is an unordered set or subset.
of an input string is a palindrome ↴
A palindrome is a string that's the same when read forward and backward.

Examples:

civic
mom
anna
.
Examples:

"civic" should return true
"ivicc" should return true
"civil" should return false
"livci" should return false
"But 'ivicc' isn't a palindrome!"

If you had this thought, read the question again carefully. We're asking if any permutation of the string is a palindrome. Spend some extra time ensuring you fully understand the question before starting. Jumping in with a flawed understanding of the problem doesn't look good in an interview.
 */


public class chkPalindromePermutation 
{
     public boolean ChkPalindromePermutation(String string)
     {
    	 Set<Character> set=new HashSet<>();
    	 
    	 for(int i=0;i<string.length();i++)
    	 {
    		 if(set.contains(string.charAt(i))){
    			 set.remove(string.charAt(i));
    		 }
    		 else
    		 {
    			 set.add(string.charAt(i));
    		 }
    	 }
    	 
    	 if(set.size()<=1)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
     
     public static void main(String[] args)
     {
    	 String s="ivcc";
    	 
    	 chkPalindromePermutation permutation=new chkPalindromePermutation();
    	 
    	 if(permutation.ChkPalindromePermutation(s))
    	 {
    		 System.out.println("The permutation of the given string is a palindrome");
    	 }
    	 else
    	 {
    		 System.out.println("The permutation of the given string is not a palindrome");
    	 }
    	 
     }
}
