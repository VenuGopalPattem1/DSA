package com.array;

import java.util.Arrays;

public class BinarySearch {
	static int binary(int a[], int tar) {
		int l = 0;
		int h = a.length - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (a[m] == tar)
				return m;
			else if (a[m] < tar)
				l = m + 1;
			else
				h = m - 1;
		}
		return -1;
	}

	static int binary1(int a[], int tar) {
		int l = 0;
		int h = (a.length - 1) / 2;
		while (l <= h) {
			int m = (l + h) / 2;
			if (a[m] == tar)
				return m;
			else if (a[m] < tar)
				l = m + 1;
			else
				h = m - 1;
		}
		return -1;
	}
	

	static int binary2(int a[], int tar) {
		return Arrays.binarySearch(a, 611);
	}

	public static void main(String[] args) {
		int[] a = new int[] { 74, 464, 89, 90, 39, 54, 67, 81, 12, 34, 55, 6, 3, 61, 61, 91 };
		int tar = 61;
		Arrays.sort(a);
		System.out.println(binary2(a, tar));
		System.out.println(Arrays.toString(a));
//		if(h%2==0)
//			System.out.print(a[l]);

//		System.out.println(Arrays.toString(a));

	}
}
