package com.array;

import java.util.Arrays;

public class NthMaxNthmin {
	public static void main(String[] args) {
		int[] a = new int[] { 74, 464, 89, 90, 39, 54, 67, 81, 12, 34, 55, 6, 3 };
		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(a));

		int l = 0;
		int h = a.length - 1;
		while (l < h) {
			System.out.print(a[l] + " " + a[h] + " ");
			l++;
			h--;
		}
		
		if(h%2==0)
			System.out.print(a[l]);

	}
}
