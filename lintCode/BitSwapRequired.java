package scu.wsn.lx;

import org.junit.Test;

public class BitSwapRequired {
	public static int bitSwapRequired(int a,int b){
		char arr[] = new char[32];
		char arr2[] = new char[32];
		String num1 = Integer.toBinaryString(a);
		String num2 = Integer.toBinaryString(b);

		for(int i=0;i<32;i++)
			arr[i]=arr2[i]='0';
		int j=0;
		for(int i=num1.length();i>0;i--)
			arr[j++] = num1.charAt(i-1);
		j=0;
		for(int i=num2.length();i>0;i--)
			arr2[j++] = num2.charAt(i-1);
		
		int res=0;
		for(int i=0;i<32;i++){
			if(arr[i]==arr2[i]);
			else res++;
		}
		return res; 
	}
	@Test
	public void test(){
		System.out.println(bitSwapRequired(1, -1));
	}
}
