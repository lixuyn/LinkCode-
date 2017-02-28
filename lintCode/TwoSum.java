package lintCode;

public class TwoSum {

	public static void main(String[] args) {
		
	}
	public static int[] twoSum(int[] nums, int target) {
	    int temp = 0;
	    for(int index = 0 ;index < nums.length -1 ; index ++){
	        temp = target - nums[index];
    	    for(int i=index+1; i< nums.length;i++){
    	        if(nums[i] == temp)
    	              return new int[]{index,i};
    	    }
	    }
		return nums;
    }
}
