package bracketValidator;

import java.util.EmptyStackException;
import java.util.Stack;

public class bracketValidator 
{
	public boolean BracketValidator(char[] a)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==')')
			{
				if(stack.isEmpty())
				{
					throw new EmptyStackException();
				}
				else if(stack.peek()=='(')
				{
					stack.pop();
				}
			}
			else if(a[i]=='}')
			{
				if(stack.isEmpty())
				{
					throw new EmptyStackException();
				}
				else if(stack.peek()=='{')
				{
					stack.pop();
				}
			}
			else if(a[i]==']')
			{
				if(stack.isEmpty())
				{
					throw new EmptyStackException();
				}
				else if(stack.peek()=='[')
				{
					stack.pop();
				}
			}
			else if(a[i]=='['||a[i]=='{'||a[i]=='(')
			{
				stack.push(a[i]);
			}
		}
		
		if(stack.isEmpty())
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
		String s="ab{cd}E[fg{h[i(j)]l}m";
		
		bracketValidator validator=new bracketValidator();
		
		if(validator.BracketValidator(s.toCharArray())==true)
		{
			System.out.println("The bracket opener has a correspoding closer");
		}
		else
		{
			System.out.println("The bracket opener does not have a correspoding closer");
		}
	}
	
}
