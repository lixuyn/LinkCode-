package scu.wsn.lx;

import java.util.Arrays;

import org.junit.Test;

public class PartitionArray {
	 public void partitionArray(int[] nums) {
	        // write your code here;
		 if(nums == null || nums.length == 0 ) return ;
		 int temp = nums[0];
		 int i =0,j = nums.length-1;
		 while(i<j){
			 while(nums[j]%2==0&&j>i){
				 j--;
			 }
			 nums[i] = nums[j];
			 while(nums[i]%2 !=0&&i<j){
				 i++;
			 }
			nums[j] = nums[i];
			
		 }
		 nums[i] = temp;
		 System.out.println(Arrays.toString(nums));
	  }
	 
	 @Test
	 public void test(){
		 int arr[] = {0, 1, 2, 3, 12,5,6,5};
		 partitionArray(arr);
	 }
}
