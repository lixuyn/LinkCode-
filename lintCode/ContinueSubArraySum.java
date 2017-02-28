package scu.wsn.lx;

import java.util.ArrayList;

import org.junit.Test;

public class ContinueSubArraySum {
	public ArrayList<Integer> continuousSubarraySum(int[] A) {
		// Write your code here
		ArrayList<Integer> list = new ArrayList<>();
		if (A == null || A.length == 0)
			return list;
		int sum = A[0];
		int index = 0, j = 0;
		for (int i = 1; i < A.length; i++) {
			if (sum + A[i] > 0 || sum + A[i] > sum) {
				sum += A[i];
				j = i;
			} else {
				index = i;
				sum = A[i];
			}
		}
		if (index > j)
			index = j;
		list.add(index);
		list.add(j);
		return list;
	}
	
	@Test
	public void test(){
		int arr[]= {-3,1,3,-3,4};
		continuousSubarraySum(arr);
	}
}
