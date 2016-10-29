package paranthesisMatching;



public class ParanthesisMatching {

	public int paranthesisMatching(String s,int inpPos)
	{
		int counter=0;
	
		
		for(int i=inpPos+1;i<s.length();i++)
		{
			if(s.charAt(i)=='('){
				counter=counter+1;
			}
			if(s.charAt(i)==')'){
				counter=counter-1;
			}
			if(counter==-1)
			{
				return i;
			}
		}
	
			throw new IllegalArgumentException("The paranthesis is nt balanced");
		
		
}
	
	public static void main(String[] args)
	{
		String s="Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
		
		ParanthesisMatching matching=new ParanthesisMatching();
		
		System.out.println("The position of the closing braces is: "+matching.paranthesisMatching(s, 10));
	}
	
	
}
