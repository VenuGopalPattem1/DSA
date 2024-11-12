package com.array;

import java.util.Arrays;

public class DeletingFromArray {
	static int k = 0;

	static int[] deleteFromPosition(int[] a, int pos) {
		int[] b = new int[a.length - 1];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == pos)
				continue;
			b[k++] = a[i];
		}
		return b;
	}

	static int[] deleteElement(int[] a, int element) {
		int[] b = new int[a.length - 1];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == element)
				continue;
			b[k++] = a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(deleteFromPosition(a,3)));
		System.out.println(Arrays.toString(deleteElement(a, 1)));
	}
}
