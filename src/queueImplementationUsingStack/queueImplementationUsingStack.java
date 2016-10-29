package queueImplementationUsingStack;
import java.util.Stack;

/*
 Implement a queue ↴ with 2 stacks ↴ . Your queue should have an enqueue and a dequeue function and it should be "first in first out" (FIFO).
Optimize for the time cost of m function calls on your queue. These can be any mix of enqueue and dequeue calls.

Assume you already have a stack implementation and it gives O(1)O(1) time push and pop.
 */

public class queueImplementationUsingStack 
{	
	//For enqueue
	Stack<Integer> stackOne=new Stack<Integer>();
	//For dequeue
	Stack<Integer> stackTwo=new Stack<Integer>();
	
	 public int enqueue(int val)
	 {
		   while(!stackTwo.isEmpty())
			 {
			   stackOne.push(stackTwo.pop());
			 }
		 stackOne.push(val);
		 
		 return val;
	 }
	 
	 public int dequeue()
	 {
		 int val=-1;
		 while(!stackOne.isEmpty())
		 {
			 stackTwo.push(stackOne.pop());
		 }
		 if(!stackTwo.isEmpty())
		 {
			 val=stackTwo.pop();
		 }
		 if(val==-1)
		 {
			 throw new IllegalArgumentException("The queue is empty");
		 }
		return val;
	 }
	 
	 public static void main(String[] args)
	 {
		 queueImplementationUsingStack queue = new queueImplementationUsingStack();
		 
		 System.out.println("Adding to queue:"+queue.enqueue(10));
		 System.out.println("Adding to queue:"+queue.enqueue(20));
		 System.out.println("Adding to queue:"+queue.enqueue(30));
		 System.out.println("Adding to queue:"+queue.enqueue(40));
		 
		 System.out.println("Removing from queue:"+queue.dequeue());
		 System.out.println("Removing from queue:"+queue.dequeue());
		 System.out.println("Adding to queue:"+queue.enqueue(50));
		 System.out.println("Removing from queue:"+queue.dequeue()); 
		 System.out.println("Removing from queue:"+queue.dequeue());
		 System.out.println("Removing from queue:"+queue.dequeue());
		 System.out.println("Removing from queue:"+queue.dequeue());
		 
	 }
}
