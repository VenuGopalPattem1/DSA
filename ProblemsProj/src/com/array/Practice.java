package com.array;

import java.util.Arrays;

public class Practice {
	static int[] equals(int[] a) {
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[k++] = a[i];
			}
		}
		while (k < a.length) {
			a[k++] = 0;
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 120, 0, 13, 0, 34, 55, 5552, 1544, 322, 1, 0, 5, 9 };
//		int[] b = { 231, 34, 56, 6,17, 8, 991, 12, 13, 14 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(equals(a)));

	}
}
