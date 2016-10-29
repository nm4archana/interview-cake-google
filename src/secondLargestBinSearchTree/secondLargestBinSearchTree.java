package secondLargestBinSearchTree;

/*Write a function to find the 2nd largest element in a binary search tree */

public class secondLargestBinSearchTree {

	
	public int findLargest(BSTNode root)
	{
		while(root.right!=null)
		root=root.right;
		
		return root.val;
		
	}
	
	public int findSecondLargest(BSTNode root)
	{
		if(root==null)
		{
			throw new IllegalArgumentException("The root is null");

		}
		if(root.left==null&&root.right==null)
		{
			throw new IllegalArgumentException("The tree must have atleast two nodes");
		}
		
		BSTNode current=root;
		
		while(current!=null){
		
		if(current.left!=null&&current.right==null){
			return findLargest(current.left);
		}
			
		if(current.right!=null&&current.right.right==null&&current.right.left==null)
		{
			return current.val;
		}
		
	   current=current.right;
		}
		
		return Integer.MIN_VALUE;
	}
	
	public static void main(String[] args)
	{
	  
		BSTNode root=new BSTNode(5);
		
		root.left=new BSTNode(3);
		root.right=new BSTNode(8);
		root.left.left=new BSTNode(1);
		root.left.right=new BSTNode(4);		
		root.right.left=new BSTNode(7);
		//root.right.right=new BSTNode(9);
		
		secondLargestBinSearchTree searchTree=new secondLargestBinSearchTree();
		System.out.println("The second largest element is: "+searchTree.findSecondLargest(root));
	}
	
}
