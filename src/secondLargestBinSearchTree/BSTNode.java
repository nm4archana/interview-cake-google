package secondLargestBinSearchTree;

public class BSTNode 
{
	
    int val;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(int val)
	{
		this.val=val;
	}
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	
}
