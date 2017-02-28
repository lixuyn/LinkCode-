package scu.wsn.lx;

import org.junit.Test;

public class IsPalindrome {
	public boolean isPalindrome(String s) {
        // Write your code here
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)<='z' && s.charAt(i)>='a') ||(s.charAt(i)<='9' && s.charAt(i)>='0'))
                sb.append(s.charAt(i));
        }
        s = sb.toString();
        if(s.length() == 0) return true;
        int m = 0;
        int n = s.length()-1;
        while(m <= n){
            if(s.charAt(m) == s.charAt(n)){
                m ++;
                n --;
            }
            else return false;
        }
        return true;
    }
	@Test
	public void test(){
		System.out.println(isPalindrome("a."));
	}
}
