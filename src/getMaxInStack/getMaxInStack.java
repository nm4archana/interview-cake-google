package getMaxInStack;
import java.util.Stack;

/*
 You want to be able to access the largest element in a stack.
Use the built-in Stack class to implement a new class MaxStack with a function getMax() that returns the largest element in the stack. getMax() should not remove the item.

Your stacks will contain only integers.
 */

public class getMaxInStack {

	Stack<Integer> stack=new Stack<Integer>();
	Stack<Integer> maxStack=new Stack<Integer>();
	
	int max;
	
   public int getMax()
   {
	   if(!maxStack.isEmpty())
		{
		  return maxStack.peek();
		}
	   else
	   {
		   throw new IllegalArgumentException("The stack is empty");
	   }
   }
	
	public int push(int val)
	{
		stack.push(val);
		
		if(!maxStack.isEmpty())
		{
			if(maxStack.peek()<val)
			{
				maxStack.push(val);
			}
		}
		else
		{
			maxStack.push(val);
		}
		return val;
	}
	
	public int pop()
	{
		int val=stack.pop();
		if(!maxStack.isEmpty())
		{
			if(maxStack.peek()==val)
			{
				maxStack.pop();
			}
		}
		return val;
	}
	
	public static void main(String[] args)
	{
		getMaxInStack inStack=new getMaxInStack();
		
		System.out.println("Adding an element to Stack: "+inStack.push(1));
		System.out.println("Adding an element to Stack: "+inStack.push(2));
		System.out.println("Adding an element to Stack: "+inStack.push(5));
		System.out.println("Adding an element to Stack: "+inStack.push(4));
		System.out.println("Adding an element to Stack: "+inStack.push(3));
		System.out.println("Adding an element to Stack: "+inStack.push(8));
		System.out.println("Getting max element: "+inStack.getMax());
		System.out.println("Deleting element in stack: "+inStack.pop());
		System.out.println("Getting max element: "+inStack.getMax());		
	}
}
