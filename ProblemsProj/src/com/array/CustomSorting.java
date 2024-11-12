package com.array;

import java.util.Arrays;

public class CustomSorting {

	static int[] sort(int a[]) {
		Arrays.sort(a);
		return a;
	}

	static int[] customesort(int a[]) {
		Arrays.sort(a, 0, a.length / 2);
		return a;
	}

	static int[] customeSort(int a[]) {
		Arrays.sort(a, a.length / 2, a.length);
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 15, 30, 4, 12, 34, 43, 12, 78, 45, 60, 75, 90, };
		System.out.println(Arrays.toString(a));
		System.out.println("-----------------------------------");
//		System.out.println(Arrays.toString(sort(a)));
//		System.out.println("-----------------------------------");
//		int[] b = sort(a);
//		for (int i = b.length - 1; i >= 0; i--)
//			System.out.print(a[i] + " , ");
//		
//		System.out.println();
//		System.out.println("-----------------------------------");

		System.out.println(Arrays.toString(customesort(a)));
		System.out.println("-----------------------------------");
		System.out.println(Arrays.toString(customeSort(a)));
	}
}
