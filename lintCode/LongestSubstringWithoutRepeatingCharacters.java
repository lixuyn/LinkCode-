package lintCode;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println("asdf".substring(0,0));
	}
	 public static int lengthOfLongestSubstring(String s) {
		 int i=0,j=i+1;
		 int max = 0;
		 while(){
			 if(s.charAt(j) == s.charAt(i)) 
			 	{i++;j++;}
		 }
	     return max;
	   }
}
