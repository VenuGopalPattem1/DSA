package com.array;

import java.util.Arrays;

public class InsertAtGivenLocation {
	static int[] insertFirst(int a[], int val, int loc) {
		int b[] = new int[a.length + 1];
		int k = 0;
		for (int i = 0; i < loc; i++)
			b[k++] = a[i];
		b[k++] = val;
		for (int i = loc; i < a.length; i++)
			b[k++] = a[i];
		return b;
	}

	public static void main(String[] args) {
		int a[] = { 74, 68, 97, 33, 5, 7 };
		int val = 45;
		int loc = 0;
		System.out.println(Arrays.toString(insertFirst(a, val, loc)));
	}
}
