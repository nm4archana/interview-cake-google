package rotationPoint;

/*
 I want to learn some big words so people think I'm smart.
I opened up a dictionary to a page in the middle and started flipping through, looking for words I didn't know. I put each word I didn't know at increasing indices in a huge array I created in memory. When I reached the end of the dictionary, I started from the beginning and did the same thing until I reached the page I started at.

Now I have an array of words that are mostly alphabetical, except they start somewhere in the middle of the alphabet, reach the end, and then start from the beginning of the alphabet. In other words, this is an alphabetically ordered array that has been "rotated." For example:

  String[] words = new String[]{
    "ptolemaic",
    "retrograde",
    "supplant",
    "undulate",
    "xenoepist",
    "asymptote", // <-- rotates here!
    "babka",
    "banoffee",
    "engender",
    "karpatka",
    "othellolagkage",
};

Write a function for finding the index of the "rotation point," which is where I started working from the beginning of the dictionary. This array is huge (there are lots of words I don't know) so we want to be efficient here.


 */


public class rotationPoint 
{

	public int RotationPoint(String[] arr,int start,int end)
	{
	
		int mid=(start+end)/2;
		
		if(arr[mid].charAt(0)=='a'&&arr[mid-1].charAt(0)!='a')
		{
			return mid;
		}
		
		if(start==end)
		{
			return -1;
		}
		
		if(arr[mid].charAt(0)=='a'&&arr[mid-1].charAt(0)!='a')
		{
			return mid;
		}
		
		if(arr[mid].charAt(0)=='a'&&arr[mid-1].charAt(0)=='a')
		{
			return RotationPoint(arr,start,mid-1);
		}
		
		if(arr[mid].charAt(0)<arr[0].charAt(0))
		{ 
			return RotationPoint(arr,start,mid-1);
		}
		
		else
		{
			return RotationPoint(arr,mid+1,end)	;
		}
	}
	
	public static void main(String[] args)
	{
		String[] words= {"k","v","a","b","c","d","e","g","i"};
		
		rotationPoint point=new rotationPoint();
		System.out.println("The rotation point starts at the index: "+point.RotationPoint(words, 0, words.length));
	}
}
