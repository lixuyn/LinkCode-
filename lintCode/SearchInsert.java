package scu.wsn.lx;

import org.junit.Test;

public class SearchInsert {
	/*
	 * ����һ�����������һ��Ŀ��ֵ��������������ҵ�Ŀ��ֵ�򷵻�������
	 * ���û�У����ص������ᱻ��˳������λ�á�
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
