package lintCode;

public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.bitCount(15));
	}
	
	public int[] getBit(int n){
		int array[] = new int[n-1];
		for(int i=0;i<=n;i++)
			array[i]=Integer.bitCount(i);
		return array;
	}
}
