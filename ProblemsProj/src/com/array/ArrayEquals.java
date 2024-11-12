package com.array;

import java.util.Arrays;

public class ArrayEquals {
	static boolean equals(int a[], int b[]) {
//		boolean q=false;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
	static boolean equals1(int a[], int b[]) {
//		Arrays.sort(a);
//		Arrays.sort(b);
		return Arrays.equals(a, b);
	}

	public static void main(String[] args) {
		int a[] = { 11, 2, 3, 4, 5 };
		int b[] = { 5, 4, 3, 2, 11 };
		System.out.println(equals(a, b));
		System.out.println(equals(a, b));

	}
}
