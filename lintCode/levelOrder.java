package scu.wsn.lx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.junit.Test;

public class levelOrder {
	/**
	 * Definition of TreeNode: public class TreeNode { public int val; public
	 * TreeNode left, right; public TreeNode(int val) { this.val = val;
	 * this.left = this.right = null; } }
	 */

	/**
	 * @param root:
	 *            The root of binary tree.
	 * @return: Level order a list of lists of integer
	 */
	private ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	private ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
	private Map<TreeNode, Integer> map = new HashMap<>();

	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		if (root == null)
			return null;
		level(root, 0);
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode temp = null;
		queue.add(root);
		int maxLev = -1;
		while (queue.peek() != null) {
			int level = map.get(queue.peek());
			temp = queue.poll();			
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
			if (level > maxLev) {
				ArrayList<Integer> tmp = new ArrayList<>();
				tmp.add(temp.val);
				list.add(tmp);
				maxLev = level;
			} else {
				list.get(level).add(temp.val);
			}

			
		}
		for(int i=list.size()-1;i>=0;i--)
			ll.add(list.get(i));
		return ll;
	}

	private void level(TreeNode root, int level) {
		if (root != null) {
			map.put(root, level);
			level(root.left, level + 1);
			level(root.right, level + 1);
		}
	}
	
	@Test
	public void test(){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left= new TreeNode(17);
		root.right.right = new TreeNode(5);
		levelOrder(root);
	}
}
