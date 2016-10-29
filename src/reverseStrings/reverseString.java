package reverseStrings;

/*
 Write a function to reverse a string in-place ↴ .
Since strings in Java are immutable ↴ , first convert the string into an array of characters, do the in-place reversal on that array, and re-join that array into a string before returning it. This isn't technically "in-place" and the array of characters will cost O(n)O(n) additional space, but it's a reasonable way to stay within the spirit of the challenge. If you're comfortable coding in a language with mutable strings, that'd be even better!

 */


public class reverseString {

	
	public String ReverseString(String s)
	{
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
	  	while(i!=j)
	  	{
	  		swap(i,j,ch);
	  		i++;
	  		j--;
	  	}
	   
	  /*StringBuilder revString=new StringBuilder();
	  	for(int l=0;l<ch.length;l++){
	  		revString.append(ch[l]);
	  	}*/
	  	
	  	return new String(ch);
	}
	
	public void swap(int a,int b,char[] s)
	{
	    char temp=s[a];
	    s[a]=s[b];
	    s[b]=temp;
		
	}
	
	public static void main(String[] args)
	{
		String s="archana";
		reverseString string=new reverseString();
		System.out.println("The reversed String is: "+string.ReverseString(s));
		
	}
}
