package scu.wsn.lx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import org.junit.Test;

public class KthSmallest {

	/**
	 * @param matrix:
	 *            a matrix of integers
	 * @param k:
	 *            an integer
	 * @return: the kth smallest number in the matrix
	 */
	public int kthSmallest(final int[][] matrix, int k) {
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		PriorityQueue<int[]> heap = new PriorityQueue<int[]>(k, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				System.out.println(matrix[a[0]][a[1]]+" " +matrix[b[0]][b[1]]);
				return Integer.compare(matrix[a[0]][a[1]], matrix[b[0]][b[1]]);
			}
		});
		heap.add(new int[] { 0, 0 });
		visited[0][0] = true;
		while (k > 1) {
			int[] res = heap.remove();
			int x = res[0];
			int y = res[1];

			if (x + 1 < matrix.length && visited[x + 1][y] == false) {
				visited[x + 1][y] = true;
				heap.add(new int[] { x + 1, y });
			}
			if (y + 1 < matrix[0].length && visited[x][y + 1] == false) {
				visited[x][y + 1] = true;
				heap.add(new int[] { x, y + 1 });
			}
			k--;
		}
		int[] res = heap.remove();
		return matrix[res[0]][res[1]];
	}
	
	@Test
	public void test(){
		System.out.println(Arrays.toString(numbersByRecursion(3).toArray()));
	}
	
	  List<Integer> list = new ArrayList<>();
	    public List<Integer> numbersByRecursion(int n) {
	        if( n ==0)return list;
	        int temp = 9;
	        while(n>1){
	            temp = temp*10 + 9;
	            n--;
	        }
	        for(int i=1;i<=temp;i++){
	            list.add(i);
	        }
	        return list;
	    }
}
