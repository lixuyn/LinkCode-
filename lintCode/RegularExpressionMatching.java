package scu.wsn.lx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {
	public static void main(String args[]) {
		System.out.println(isMatch("aaa","ab*a*c*a"));
	}

	/*
	 * isMatch("aa","a") ¡ú false 
	 * isMatch("aa","aa") ¡ú true 
	 * isMatch("aaa","aa") ¡úfalse
	 * isMatch("aa", "a*") ¡ú true
	 * isMatch("aa", ".*") ¡ú true 
	 * isMatch("ab",".*") ¡ú true
	 * isMatch("aab", "c*a*b") ¡ú true 
	 */

	public static boolean isMatch(String s, String p) {
		if ((!p.contains("*") && !p.contains(".")) && s.length() != p.length())
			return false;
		int i = 0;
		String temp ="";
		for(;i<p.length();i++){
			if(p.charAt(i)=='*'){
				temp += p.charAt(i-1);
			}else {
				temp += p.charAt(i);
			}
		}
		System.out.println(temp);
		int j =0;
		for(i=0;i<temp.length()&&j<s.length();i++){
			if(temp.charAt(i) == '.'||temp.charAt(i)==s.charAt(j)){
				j++;			
			}	
		}
		return (j==s.length()&&i==temp.length()&&j!=0&&i!=0)?true:false;
	}
}
