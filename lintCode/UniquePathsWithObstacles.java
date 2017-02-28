package scu.wsn.lx;

import org.junit.Test;

public class UniquePathsWithObstacles {
	/**
	 * @param obstacleGrid:
	 *            A list of lists of integers
	 * @return: An integer
	 */
	public int uniquePathsWithObstacles(int[][] grid) {
		// write your code her
		if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1)
			return 0;
		if (grid.length == 1) {
			for (int j = 0; j < grid[0].length; j++)
				if (grid[0][j] == 1)
					return 0;
			return 1;
		}
		if (grid.length == 1) {
			for (int j = 0; j < grid.length; j++)
				if (grid[j][0] == 1)
					return 0;
			return 1;
		}
		for (int i = 1; i < grid[0].length && grid[0][i] != 1; i++) {
			grid[0][i] = -1;
		}
		for (int i = 1; i < grid.length && grid[i][0] != 1; i++) {
			grid[i][0] = -1;
		}

		for (int row = 1; row < grid.length; row++) {
			for (int col = 1; col < grid[0].length; col++) {
				if (grid[row][col] != 1 && grid[row - 1][col] != 1 && grid[row][col - 1] != 1) {
					grid[row][col] += grid[row - 1][col] + grid[row][col - 1];
				} else if (grid[row][col] != 1 && grid[row - 1][col] == 1) {
					grid[row][col] = grid[row][col - 1];
				} else if (grid[row][col] != 1 && grid[row][col - 1] == 1) {
					grid[row][col] = grid[row - 1][col];
				}
			}
		}
		return -grid[grid.length - 1][grid[0].length - 1];

	}

	@Test
	public void test() {
		int arr[][] = { { 0, 1, 0 }, { 0, 0 , 0}, { 0, 1, 0 }, { 0, 0, 0 }, { 0, 0 ,0 }, { 0, 0 ,0} };
		System.out.println(uniquePathsWithObstacles(arr));
	}
}
