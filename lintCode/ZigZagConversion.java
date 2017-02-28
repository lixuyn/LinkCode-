package lintCode;

public class ZigZagConversion {

	public static void main(String[] args) {
		convert("ab",3);
	}
	
	public static String convert(String s, int numRows) {
        if(numRows==1){return s;}
        int row =0, cols=numRows-2,i=0;
        String res[] = new String[numRows];
        for(int j=0;j< res.length;j++){res[j]="";}
        while(i<s.length()){
            //row
            for(row=0; row<s.length()&&row<numRows ; row++){
                res[row] += s.charAt(i++);
            }
            //col
            for(cols=numRows-2 ;cols>0 &&i<s.length(); cols--){
                res[cols] += s.charAt(i++);
            }
        }
        String result = "";
        for(String temp: res){
            result+=temp;
        }
        return result;
    }

}
