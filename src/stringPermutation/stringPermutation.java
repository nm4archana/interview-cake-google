package stringPermutation;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class stringPermutation 
{
    public ArrayList<String> StringPermutation(char[] chars)
    {
    	Map<Character, Integer> map=new TreeMap<Character, Integer>();
    	
    	for(int i=0;i<chars.length;i++)
    	{
    		if(map.containsKey(chars[i]))
    		{
    			int val=map.get(chars[i]);
    			map.replace(chars[i], val+1);
    	    }
    		else
    		{
    			map.put(chars[i], 1);
    		}
    	}
    	
    	char[] tempStr=new char[map.size()];
    	int[] count= new int[map.size()];
    	int i=0;
    	for(Map.Entry<Character, Integer> entry:map.entrySet())
    	{
    		tempStr[i] = entry.getKey();
    		count[i] = entry.getValue();
    		i=i+1;
    	}
    	
    	ArrayList<String> resultList=new ArrayList<String>();
    	char[] charResult=new char[chars.length];
    	
    	doPermutation(charResult,resultList,tempStr,count,0);
    	
    	return resultList;
    	
    }
    
    public void doPermutation(char[] charResult,ArrayList<String> resultList,
    		char[] tempStr,int[] count,int level)
     {
    	
    	if(level==charResult.length)
		{
			resultList.add(new String(charResult));
			return;
		}
    	
    	for(int i=0;i<tempStr.length;i++)
    	{
    		//If the count of the character is zero, then continue to the next character with count>0
    		if(count[i]==0)
    		{
    			continue;
    		}
    		//filling the result array 
        	charResult[level]=tempStr[i];
        	count[i]=count[i]-1;
        	doPermutation(charResult,resultList,tempStr,count,level+1);
        	
        	count[i]=count[i]+1;
    	}	
    }
    
  
    public static void main(String[] args)
    {
    	stringPermutation permutation=new stringPermutation();
    	String string="ABBC";
    	ArrayList<String> list=permutation.StringPermutation(string.toCharArray());
    	for(int i=0;i<list.size();i++)
    	{
    		System.out.println(list.get(i));
    	}
    	
    }
}
