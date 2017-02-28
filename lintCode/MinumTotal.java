package scu.wsn.lx;

import org.junit.Test;

public class MinumTotal {
	public int minimumTotal(int[][] triangle) {
		if (null == triangle)
			return 0;
		int row = triangle.length;
		if (row <= 0)
			return 0;
		int[][] steps = new int[row][row];
		int min = Integer.MAX_VALUE;
		steps[0][0] = triangle[0][0];
		if (row == 1)
			return steps[0][0];
		for (int i = 1; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					steps[i][j] = steps[i - 1][j] + triangle[i][j];
				} else if (j == i) {
					steps[i][j] = steps[i - 1][j - 1] + triangle[i][j];
				} else {
					steps[i][j] = Math.min(steps[i - 1][j], steps[i - 1][j - 1]) + triangle[i][j];
				}

				if (i == row - 1) {
					if (steps[i][j] < min) {
						min = steps[i][j];
					}
				}
			}
		}
		return min;
	}

	@Test
	public void test() {
		// System.out.println(min(-22,-18,-17));
		/*
		 * [2], [3,4], [6,5,7], [4,1,8,3]
		 */
		int arr[][] = { { -7 }, { -2, 1 }, { -5, -5, 9 }, { -4, -5, 4, 4 }, { -6, -6, 2, -1, -5 },
				{ 3, 7, 8, -3, 7, -9 } };

		System.out.println("\n" + minimumTotal(arr));
	}
}
