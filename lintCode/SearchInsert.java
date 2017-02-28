package scu.wsn.lx;

import org.junit.Test;

public class SearchInsert {
	/*
	 * 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。
	 * 如果没有，返回到它将会被按顺序插入的位置。
	 */
	public int searchInsert(int[] A, int target) {
		if(A == null || A.length ==0) return 0;
		int i=0;
		for(;i<A.length;i++){
			if(target <= A[i]) 
				return i;
		}
		return i;
	}
	@Test
	public void test(){
		int arr[]=  {1,3,5,6};
		System.out.println(searchInsert(arr,5));
	}
}
