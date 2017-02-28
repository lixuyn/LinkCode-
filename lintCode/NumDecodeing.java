package scu.wsn.lx;

import org.junit.Test;

public class NumDecodeing {
	public int numDecodings(String s) {
		// Write your code here
		if (s == null || s.length() == 0)
			return 0;
		if (s.length() == 1)
			return 1;
		int len = s.length();
		int arr[] = new int[len];
		arr[len -1] = 1;
		for (int i = len-1; i >=0; i--) {
             if(s.charAt(i)-'0'>2)
            	 arr[i]=arr[i-1]+1;
             else if(s.charAt(i) =='0')
            	 continue;
             else{
            	 arr[i] = arr[i+1]+2;//+arr[i+2];
             }
		}
		return arr[0];
	}
	
	@Test
	public void test(){
		String str="10";
		System.out.println(numDecodings(str));
	}
}
