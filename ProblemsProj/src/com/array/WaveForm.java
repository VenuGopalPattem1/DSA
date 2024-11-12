package com.array;

import java.util.Arrays;

public class WaveForm {
	public static void main(String[] args) {
		int[] a = new int[] { 74, 464, 89, 90};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(a));

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int l = 0;
		int h = a.length - 1;
		int h1 = a.length;
		System.out.print(a[0] + " ");

		for (int i = 1; i < h; i = i + 2) {
			int temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
			System.out.print(a[i] + " " + a[i + 1] + " ");
		}

		if (h1 % 2 == 0)
			System.out.print(a[h]);

//		System.out.println(Arrays.toString(a));

	}
}
