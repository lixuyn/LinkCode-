package scu.wsn.lx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        if(nums != null && nums.size() > 0){
          Map<Integer,Integer> res = new HashMap<>();
          for(int j=0;j<nums.size();j++){
              if(res.containsKey(nums.get(j))){
                  int count = res.get(nums.get(j));
                 res.put(nums.get(j),++count);
              }else{
                  res.put(nums.get(j),1);
              }
          }
          for(int j=0;j<nums.size();j++){
        	  int num = res.get(nums.get(j));
              if(num >nums.size()/2.0)   
                return nums.get(j);
          }
        }
        return -1;
    }
    
    @Test
    public void test(){
    	int a[] ={1,2,3};
    	int b[]= {35,66};
    	mergeSortedArray(a, b);
    }
           public int[] mergeSortedArray(int[] A, int[] B) {
           if(A == null && B == null) return null;
           int arr[] = new int[A.length+B.length];
           System.arraycopy(A,0,arr,0,A.length);
           System.arraycopy(B,0,arr,A.length,B.length);
           Arrays.sort(arr);
           return arr;
        }

    @Test
    public void testMax(){
    	int max = Integer.MAX_VALUE ;
    	if(max*10<max)
    		System.out.println("false");
    	else 
    		System.out.println("true");
    }
}