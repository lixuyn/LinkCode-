package scu.wsn.lx;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		if(nums == null && nums.length ==0) return;
		int arr[] = new int[nums.length];
		int j=0;
		for(int i=0;i<nums.length;i++)
			if(nums[i] !=0)
				arr[j++]= nums[i];
		nums = arr;
		System.out.println(Arrays.toString(nums));
	}
	@Test
	public void test(){
		int arr[]={5, 0, 0, 3, 0, 12, 6, 2};
		moveZeroes(arr);
	}
}
