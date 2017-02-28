package scu.wsn.lx;

import org.junit.Test;

public class BinarySearch {
	public static int binarySearch(int[] nums, int target) {
        //write your code here
        int low =0;
        int hight = nums.length-1;
        while(low<=hight){
            if(nums[(low+hight)/2]==target&&nums[(low+hight)/2-1]!=target) 
                return (low+hight)/2;
            if(nums[(low+hight)/2]>=target) 
                hight = (low+hight)/2-1;
            if(nums[(low+hight)/2]<target) 
                low =  (low+hight)/2+1;
        }
        return -1;
    }
	
	@Test
	public void test(){
		int array[] = {3,4,5,8,8,8,8,10,13,14};
		System.out.print(binarySearch(array,8));
	}
}
