package scu.wsn.lx;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class MinSubArray {
	 public int minSubArray(ArrayList<Integer> nums) {
	        // write your code
	        if(nums == null ) return 0;
	        int maxSum = Integer.MAX_VALUE;
	        int sum =0;
	        for(int j=0;j<nums.size();j++){
	        	sum+=nums.get(j);
	        	if(nums.get(j)<sum)	        		
	               sum = nums.get(j);
	            maxSum = maxSum<sum?maxSum:sum;
	        } 
	       return maxSum;
	    }
	 @Test
	 public void test(){
		 System.out.println(minSubArray(new ArrayList<Integer>(Arrays.asList(-4,5,-1000))));
	 }
}
