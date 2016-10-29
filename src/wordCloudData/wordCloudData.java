package wordCloudData;


/*
You want to build a word cloud, an infographic where the size of a word corresponds to how often it appears in the body of text.
To do this, you'll need data. Write code that takes a long string and builds its word cloud data in a hash map ↴ , where the keys are words and the values are the number of times the words occured.

Think about capitalized words. For example, look at these sentences:

"After beating the eggs, Dana read the next step:"
"Add milk and eggs, then add flour and sugar."
What do we want to do with "After", "Dana", and "add"? In this example, your final hash map should include one "Add" or "add" with a value of 22. Make reasonable (not necessarily perfect) decisions about cases like "After" and "Dana".

Assume the input will only contain words and standard punctuation.
*/


import java.util.HashMap;
public class wordCloudData 
{
	 HashMap<String, Integer> map=new HashMap<String, Integer>();
	     
	public void WordCloudData(String string)
	{
		 // /w -  non-word literal - http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html 
		// arrStrings=string.split("\\W+");
		 
		 String currentWord="";
		 
		 for(int i=0;i<string.length();i++)
		 {
			 char character=string.charAt(i);
			 
			 
			 //If we reach the end of the string
			 if(i==string.length()-1)
			 {
				 if(Character.isAlphabetic(character))
				 {
					 currentWord=currentWord+character;
				 }
				 
				 if(!currentWord.isEmpty())
				 {
					 addWordToHashMap(currentWord);
				 }
			 }
			 
			 //If we reach an empty space or hyphen(emdash) or .
			 else if(character==' '|| character == '\u2014'||character == '.')
			 {
				 if(!currentWord.isEmpty())
				 {
					 addWordToHashMap(currentWord);
				 }
				 currentWord="";
			 }
			 
			 //If its a character or apostrophe, add it to current Word
			 else if(Character.isAlphabetic(character)|| character == '\'')
			 { 
				 currentWord=currentWord+character;
			 }
			
			 //
			 else if (character == '-') 
			 {
				 if(Character.isAlphabetic(string.charAt(i-1))&&Character.isAlphabetic(string.charAt(i+1)))
				 {
					 currentWord=currentWord+character;
				 }
			 }
		 }
		
	}
	
	public void addWordToHashMap(String word)
	{
		if(map.containsKey(word))
		{
			int val=map.get(word)+1;
			map.put(word, val);
		}
		
		
		else if(map.containsKey(word.toLowerCase()))
		{
			int val=map.get(word.toLowerCase())+1;
			map.put(word, val);
		}
		
		// if an uppercase version is in the hash map, we know our input word must be lowercase.
        // since we only include uppercase words if they're always uppercase, we add the
        // lowercase version and give it the uppercase version's count
		else if(map.containsKey(capitalize(word)))
		{
			int val=map.get(capitalize(word))+1;
			map.put(word, val);
			map.remove(capitalize(word));
		}
	}
	
	 private String capitalize(String word)
	 {
	        return word.substring(0, 1).toUpperCase() + word.substring(1);
	 }
	
	public static void main(String[] args)
	{
		//String s="After beating the eggs, Dana read the next step:'Add milk and eggs, then add flour and sugar.'";
		String s="We came, we saw, we conquered...then we ate Bill's (Mille-Feuille) cake.";
	    wordCloudData cloudData=new wordCloudData();
	    cloudData.WordCloudData(s);
	}

}
