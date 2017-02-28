package scu.wsn.lx;

import org.junit.Test;

public class SingleNumberII {
	public int singleNumberII(int[] A) {
		// write your code here
		// if(A == null || A.length ==0) return ;
		int ones = 0, tows = 0;
		for (int i = 0; i < A.length; i++) {
			ones = (ones ^ A[i]) & ~tows;
			System.out.println(~tows);
			tows = (tows ^ A[i]) & ~ones;
			System.out.println(~ones);
		}
		return ones;
	}
	
	@Test
	public void test(){
		int arr[] = {1,1,2,3,3,3,2,2,4,1};
		singleNumberII(arr);
	}
}
