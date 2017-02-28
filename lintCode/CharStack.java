
package scu.wsn.lx;

import org.junit.Test;


public class CharStack {
	public boolean isValidParentheses(String s) {
        char stack[] = new char[s.length()];
        int index =-1;
     //   if(s.length()%2 != 0 ) return false;
        char top = ' ';
        for(int j=0;j<s.length();j++){
            if(s.charAt(j) =='('||s.charAt(j) =='['||s.charAt(j) =='{'){
                stack[++index] = s.charAt(j);
            }else{
               if(index >=0){
            	   top = stack[index--];
            	   if(s.charAt(j)==')'&& top !='(') return false;
                   if(s.charAt(j)==']'&& top !='[') return false;
                   if(s.charAt(j)=='}'&& top !='{') return false;
               }else
            	   return false;
                
            }
        }
        if(index == -1) return true;
        else return false;
    }
	
	@Test
	public void test(){
		isValidParentheses("}}}{{{");
	}
}
