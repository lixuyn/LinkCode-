package lintCode;
public class HouseRobberIII {
	public static void main(String[] args) {
		TreeNode n = new TreeNode(3);
		TreeNode n1 =new TreeNode(4);
		TreeNode n2 = new TreeNode(5);
		TreeNode n3 = new TreeNode(1);
		TreeNode n4 =new TreeNode(3);
		TreeNode n5 = new TreeNode(1);
		n.setLeftChild(n1);
		n.setRightChild(n2);
		n1.setLeftChild(n3);
		n1.setRightChild(n4);
		n2.setRightChild(n5);
		System.out.println(solution(n,false));
	}
	
	public static int solution(TreeNode node,boolean flag){
		int maxNum = 0;
		if(flag == true)
			maxNum =  node.getValue(); 
		else 
			maxNum = 0;
		if(node.getLeftChild() != null){
			maxNum += solution(node.getLeftChild(),!flag);
		}
		if(node.getRightChild() != null){
			maxNum += solution(node.getRightChild(),!flag);
		}
		return maxNum;
	}
}
class TreeNode{
	private int value;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(int x)
	{
		this.setValue(x);
		this.leftChild = null;
		this.rightChild = null;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
