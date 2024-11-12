package com.array;

import java.util.Arrays;

public class UpdateLocation {
	static int[] update(int a[], int loc, int val) {
		int[] b = new int[a.length];
//		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == loc)
				b[i] = val;
			else
				b[i] = a[i];
		}
		return b;
	}
	
	static int[] updateElemnt(int a[], int loc, int val) {
		int[] b = new int[a.length];
//		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == loc)
				b[i] = val;
			else
				b[i] = a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 34, 55, 26, 42, 86 };
//		int loc=6;
		int val = 90;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(update(a, 2, val)));
		System.out.println(Arrays.toString(updateElemnt(a, 86, val)));
	}
}
