package scu.wsn.lx;

import org.junit.Test;

public class UniquePaths {
	public int uniquePaths(int m, int n) {
		int arr[][] = new int[m][n];
		arr[0][0] =0;
		for(int r=1;r<n;r++){
			arr[0][r] =1;
		}
		for(int c=1;c<m;c++){
			arr[c][0] = 1;
		}
		for(int r = 1;r<m;r++){
			for(int c =1;c<n;c++){
				arr[r][c] = arr[r][c-1]+arr[r-1][c];
			}
		}
		System.out.print(arr[m-1][n-1]);
		return 0;
	}
	@Test
	public void test(){
		uniquePaths(2, 62);
	}
}
