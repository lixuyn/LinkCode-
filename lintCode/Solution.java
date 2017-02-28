package lintCode;

class Node {
    int val;
    Node left;
    Node right;
    Node(int x) { val = x;}
}
public class Solution{
	public static void main(String args[]){
		Node n = new Node(3);
		Node n1 =new Node(4);
		Node n2 = new Node(5);
		Node n3 = new Node(1);
		Node n4 =new Node(3);
		Node n5 = new Node(1);
		n.left=n1;
		n.right=n2;
		n1.left=n3;
		n1.right=n4;
		n2.right=n5;
		System.out.println(rob(n));
	}

  public static int rob(Node root) {
      int res[] = solution(root);
      return Math.max(res[0], res[1]);
      
  }
 
  public static int[] solution(Node node){
	  if(node == null){  
		  return new int[2];
	  }   
	  int left[] = solution(node.left);
	  int right[] = solution(node.right);
	  int res[] = new int[2];
	  res[0] = Math.max(left[0], left[1])+Math.max(right[0],right[1]);
      res[1] = node.val + left[0]+ right[0];
	return res;
  }

}