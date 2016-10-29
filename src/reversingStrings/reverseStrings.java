package reversingStrings;

import java.util.ArrayList;

/*
You're working on a secret team solving coded transmissions.
Your team is scrambling to decipher a recent message, worried it's a plot to break into a major European National Cake Vault. The message has been mostly deciphered, but all the words are backwards! Your colleagues have handed off the last step to you.

Write a function reverseWords() that takes a string message and reverses the order of the words in-place ↴ .

Since strings in Java are immutable ↴ , we'll first convert the string into an array of characters, do the in-place word reversal on that array, and re-join that array into a string before returning it. This isn't technically "in-place" and the array of characters will cost 
O
n
O(n) additional space, but it's a reasonable way to stay within the spirit of the challenge. If you're comfortable coding in a language with mutable strings, that'd be even better!

For example:

  String message = "find you will pain only go you recordings security the into if";

reverseWords(message);
// returns: "if into the security recordings you go only pain will you find"

When writing your function, assume the message contains only letters and spaces, and all words are separated by one space.
*/

public class reverseStrings 
{
    public String reverseString(String message)
    {
    	String s = "";
    	String result="";
    	ArrayList <String> list=new ArrayList<String>();
    	
    	//O(n)
    	for(int i=0;i<message.length();i++)
    	{
    		if(i+1==message.length())
    		{
    			list.add(s+message.charAt(i)+" ");
    		} 
    	
    		if(message.charAt(i)==' ')
    		{
    			list.add(s+" ");
    			s="";
    		}
    		else
    		{
    		 s=s+message.charAt(i);
    		}
    	}
    	
    	
    	for(int i=list.size()-1;i>=0;i--)
    	{
    		result=result+list.get(i);
    	}
    	
    	return result;
    }
    
    public static void main(String[] args)
    {
    	String message="I like to eat mangoe's";
    	
    	reverseStrings strings=new reverseStrings();
    
    	System.out.println("The reversed string is : "+strings.reverseString(message).trim());
       
    }
	
}
