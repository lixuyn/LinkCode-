package scu.wsn.lx;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[] = new int[] {};
		int arr2[] = new int[] {2, 3 };
		System.out.println(merge(arr1, arr2));

	}

	public static double merge(int arr1[], int arr2[]) {
		int tmp[] = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, tmp, 0, arr1.length);
		System.arraycopy(arr2, 0, tmp, arr1.length, arr2.length);
		Arrays.sort(tmp);
		if ((arr1.length + arr2.length) % 2 != 0)
			return (double) tmp[(arr1.length + arr2.length) / 2];
		else
			return (double) (tmp[(arr1.length + arr2.length) / 2] + tmp[(arr1.length + arr2.length) / 2 - 1]) / 2;

	}

}
