package scu.wsn.lx;

import org.junit.Test;

public class AddOne {
	public int[] plusOne(int[] digits) {
		// Write your code here
		if (digits == null)
			return null;		
		digits[digits.length-1] = digits[digits.length-1]+1;
		int temp = digits[digits.length-1]/10;
		for (int j = digits.length - 1; j >= 0; j--) {
			if (digits[j] + temp >= 10) {
				digits[j] = 0;
				temp = 1;
			} else {
				digits[j] = digits[j] + temp;
				temp = 0;
			}
		}
		if (temp == 1) {
			int arr[] = new int[digits.length + 1];
			arr[0] = 1;
			System.arraycopy(digits, 0, arr, 1, digits.length);
			return arr;

		} else {
			return digits;
		}

	}

	@Test
	public void test() {
		int arr[] = {9};
		plusOne(arr);
	}
}
