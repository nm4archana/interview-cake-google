package linkedListCycle;

public class LinkedListCycle {

	public Boolean linkedListCycle(ListNode head)
	{
		ListNode slowPtr=head;
		ListNode fastPtr=head.next.next;
		
		while(slowPtr!=fastPtr)
		{
			if(slowPtr.next==null||fastPtr.next==null)
			{
				return false;
			}
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return true;
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
		//node7.next=node4;
		
		LinkedListCycle cycle=new LinkedListCycle();
		
		Boolean flag=cycle.linkedListCycle(node1);
		
		if(flag==true)
		{
			System.out.println("The loop exists in the linked list");
		}
		else
		{
			System.out.println("The loop does not exists in the linked list");
		}
	}
}
