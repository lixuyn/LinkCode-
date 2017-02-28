package scu.wsn.lx;

import java.util.Arrays;

import org.junit.Test;

public class RotateString {
	public void rotateString(char[] str, int offset) {
		if (str == null || offset == 0 || str.length == 0)
			return;
		if(offset>str.length) offset %= str.length;
		StringBuffer  buf = new StringBuffer();
		for(int i = str.length -offset;i<str.length;i++){
			buf.append(str[i]);
		}
		for(int i=0;i<str.length - offset;i++){
			buf.append(str[i]);
		}
		str = buf.toString().toCharArray();
		System.out.println(Arrays.toString(str));
	}
	/*
	 * "cppjavapy", 25
	 * ÆÚÍû´ð°¸
	 * pjavapycp"
	 * */
	@Test
	public void test(){
		rotateString("".toCharArray(), 25);
	}
}
