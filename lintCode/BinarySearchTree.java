package scu.wsn.lx;

import org.junit.Test;

class TreeNode {
	     public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
public class BinarySearchTree {
	public static TreeNode insertNode(TreeNode root, TreeNode node) {
        if(root==null) {
               root = node;
               return root;
           }
       TreeNode t = root,pre=null;
       while(t!=null){
    	   pre = t;
    	   t = t.val > node.val ? t.left : t.right;
       }
       if(pre.val>node.val) pre.left = node;
       else pre.right = node;
       return root;
   }
  
	 public static int hashCode(char[] key,int HASH_SIZE) {
		  int hash =key[0];	        
	        for(int i=1;i<key.length; i++){
	            hash =33*hash%HASH_SIZE+(int)key[i];
	        }
	        return hash%HASH_SIZE;
	    }
	  
  @Test
  public void test(){	 
	  System.out.println(hashCode("abcd".toCharArray(), 1000));
  }
}
