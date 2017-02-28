package lintCode;

public class StringtoInteger {

	public static void main(String[] args) {
		System.out.println(myAtoi("9223372036854775809"));
		//System.out.println(Long.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
	}
	public static int myAtoi(String str) {
        String str1 = str.trim();
        if(str1.length()==0 ){
            return 0;
        }
        long t = 0;
		int index =0;
		int flag = 1;
		while(index < str1.length()&&(str1.charAt(index)=='+'||str1.charAt(index) == '-') ){
		    index++;
		}
		if(str1.charAt(0) == '-') flag =-1;
	    if(index <= 1)
			while(index < str1.length()&& str1.charAt(index)>='0'&& str1.charAt(index)<='9' && t< Long.MAX_VALUE/10){
				int temp = str1.charAt(index) - '0';
				t = t*10 + temp;
				index++;
			}
		if(t*flag>Integer.MAX_VALUE ) return Integer.MAX_VALUE;
		if(t*flag<Integer.MIN_VALUE) return Integer.MIN_VALUE;
	  
	    return	(int) (str1.charAt(0)=='-'?-t:t);
	}
}
