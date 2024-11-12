package com.array;

import java.util.Arrays;

public class NthMaxMin {
	public static void main(String[] args) {
		int[] a = new int[] { 74, 464, 89, 90, 39, 54, 67, 81, 12, 34, 55, 6, 3 };
		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(a));

		System.out.println(a[7-1] + " is the min element");
		System.out.println(a[a.length - 1] + " is the max element");

	}
}
