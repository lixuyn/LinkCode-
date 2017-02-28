package scu.wsn.lx;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SetZero {
	public void setZeroes(int[][] matrix) {
		// write your code here
		Map<Integer, Integer> map = new HashMap<>();
		if (matrix == null || matrix.length == 0)
			return;
		for (int j = 0; j < matrix.length; j++) {
			for (int i = 0; i < matrix[0].length; i++) {
				if (matrix[j][i] == 0) {
					map.put(j, i);
				}
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Arrays.fill(matrix[entry.getKey()], 0);
			res(matrix, entry.getValue());
		}
	}

	private void res(int arr[][], int n) {
		for (int i = 0; i < arr.length; i++) {
			arr[i][n] = 0;
		}
	}
	
	@Test
	public void test(){
		int arr[][] = {{3,5,5,6,9,1,4,5,0,5},{2,7,9,5,9,5,4,9,6,8},{6,0,7,8,1,0,1,6,8,1},{7,2,6,5,8,5,6,5,0,6},{2,3,3,1,0,4,6,5,3,5},{5,9,7,3,8,8,5,1,4,3},{2,4,7,9,9,8,4,7,3,7},{3,5,2,8,8,2,2,4,9,8}};
		setZeroes(arr);
	}
}
