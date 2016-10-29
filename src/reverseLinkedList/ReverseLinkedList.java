package reverseLinkedList;

import linkedListCycle.ListNode;

public class ReverseLinkedList {

	public ListNode reverseLinkedList(ListNode node)
	{
		if(node==null)
		{
			throw new IllegalArgumentException("The given node is null");
		}
		
		if(node.next==null)
		{
			throw new IllegalArgumentException("The Linked list must have atleast two node to reverse the list");
		}
		
		ListNode next=node.next; 	
		ListNode current=node;
		current.next=null;
		
		while(next!=null)
		{
		
			ListNode nextNext=next.next;
			
	
			next.next=current;
	
			current=next;
			next=nextNext;
			
		}
		
		return current;
	}
	
	public static void main(String[] args)
	{
		ReverseLinkedList linkedList=new ReverseLinkedList();
		ListNode node1=null;
	/*	ListNode node1=new ListNode(1);
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
		*/
		ListNode node=linkedList.reverseLinkedList(node1);
		
		while(node!=null){
			System.out.println(node.val);
			node=node.next;
		}
		
	}
	
}
