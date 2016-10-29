package superBalancedBinaryTree;
import java.util.LinkedList;
import java.util.Queue;

public class superBalancedBinaryTree 
{
      public Boolean SuperBalancedBinaryTree(BinaryTreeNode root)
      {
    	  Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
    	  
    	  queue.add(root);
    	  
    	  int count=0;
    	  
    	  int n=0;
    	  Boolean chkFlag=true;
    	  while(!queue.isEmpty())
    	  {
    		  int actualNodes=(int) Math.pow(2, n);
    		  count=queue.size();
    	
    		  if(count<actualNodes)
    		  {
    			  chkFlag=false;
    		  }
    		  while(count>0)
    		  {
    		  BinaryTreeNode node=queue.remove();
    		  if(chkFlag==false&&(node.left!=null||node.right!=null))
    		  {
    			  return false;
    		  }
    		  if(node.left!=null)
    		  {
    			  queue.add(node.left);
    		  }
    		  if(node.right!=null)
    		  {
    			  queue.add(node.right);
    		  }
    		  count=count-1;
    	      }
    		  n=n+1;
    		  
    	  }
    	  return true;
      }
      
      public static void main(String[] args)
      {
    	  superBalancedBinaryTree binaryTree=new superBalancedBinaryTree();
    	  
    	  BinaryTreeNode root=new BinaryTreeNode(10);
    	  BinaryTreeNode a=new BinaryTreeNode(7);
    	  BinaryTreeNode b= new BinaryTreeNode(15);
    	  //BinaryTreeNode c= new BinaryTreeNode(3);
    	  BinaryTreeNode d= new BinaryTreeNode(8);
    	  BinaryTreeNode e= new BinaryTreeNode(9);
    	  //BinaryTreeNode f= new BinaryTreeNode(17);
    	  
    	  root.left=a;
    	  root.right=b;
    	  //a.left=c;
    	  a.right=d;
    	  d.right=e;
    	  
    	 
    	  
    	  if(binaryTree.SuperBalancedBinaryTree(root))
    	  {
    		  System.out.println("The trree is super balanced");
    	  }
    	  else
    	  {
    		  System.out.println("The tree is not super balanced");
    	  }
      }
     
}
