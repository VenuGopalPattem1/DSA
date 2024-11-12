package com.array;

import java.util.Arrays;

public class SortDESC {

	static int[] asc(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	static int[] sort(int a[]) {
		Arrays.sort(a);
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 15, 30, 45, 60, 75, 90, 4, 12, 34, 43, 12, 78 };
		System.out.println(Arrays.toString(a));
		System.out.println("-----------------------------------");
		System.out.println(Arrays.toString(asc(a)));
		System.out.println("-----------------------------------");
		System.out.println(Arrays.toString(sort(a)));
		System.out.println("-----------------------------------");
		int[] b = sort(a);
		for( int i=b.length-1;i>=0;i--)
			System.out.print(a[i]+" ");
	}
}
