package kthToLastNode;

import linkedListCycle.ListNode;

public class KthToLastNode 
{
   public ListNode kthToLastNode(ListNode root,int k)
   {
	   ListNode leftPtr=root;
	   ListNode rightPtr=root;
	   while(k>=0)
	   {
		   rightPtr=rightPtr.next;
		   k=k-1;
	   }
	   
	   while(rightPtr!=null)
	   {
		   leftPtr=leftPtr.next;
		   rightPtr=rightPtr.next;
	   }
	return leftPtr;
   }
	
	public static void main(String[] args)
	{
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(6);
		ListNode node7=new ListNode(7);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		
	KthToLastNode lastNode=new KthToLastNode();
	
	System.out.println("Kth Node from the last node is: "+lastNode.kthToLastNode(node1, 2).val);
	
	}
}
