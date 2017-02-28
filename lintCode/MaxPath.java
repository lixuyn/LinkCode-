package scu.wsn.lx;

import org.junit.Test;

public class MaxPath {
	/**
	 * @param root:
	 *            The root of binary tree.
	 * @return: An integer.
	 */
	private int res = 0;

	public int maxPathSum(TreeNode root) {
		// write your code here
		res(root);
		return res;
	}

	private int res(TreeNode root) {
		if (root == null)
			return 0;
		int left = res(root.left);
		int right = res(root.right);
		res = Math.max(res, Math.max(0, left) + Math.max(0, right) + root.val);
		return Math.max(0, Math.max(left, right)) + root.val;
	}
	
	@Test
	public void test(){
		TreeNode root= new TreeNode(2);
		maxPathSum(root);
	}
}
