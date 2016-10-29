package deleteNode;

/*
Delete a node from a singly-linked list ↴ , given only a variable pointing to that node.
The input could, for example, be the variable b below:
*/


public class DeleteNode {

	public int deleteNode(LinkedListNode listNodetoDelete)
	{
		LinkedListNode nextToDeleteNode=listNodetoDelete.next;
		
		int returnNodeVal=listNodetoDelete.val;
		
		if(nextToDeleteNode!=null){
		
		listNodetoDelete.val=nextToDeleteNode.val;
		
		listNodetoDelete.next=nextToDeleteNode.next;
		
		return returnNodeVal;
		}
		
	
		else
		{
			throw new IllegalArgumentException("Trying to delete the last node");
		}
	}
	
	public static void main(String[] args)
	{
		LinkedListNode a = new LinkedListNode(1);
		LinkedListNode b = new LinkedListNode(2);
		LinkedListNode c = new LinkedListNode(3);

		a.next = b;
		b.next = c;

		DeleteNode deleteNode=new DeleteNode();
		System.out.println("The value deleted is: "+deleteNode.deleteNode(b));
	}
	
}
