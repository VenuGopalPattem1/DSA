package com.array;

import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = new int[] { 74, 464, 89, 90, 39, 54, 67, 81, 12, 34, 55, 6, 3, 61, 61, 91 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int ele = 91;
		int out = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				out = i;
				break;
			}
		}

		System.out.println(out);

//		if(h%2==0)
//			System.out.print(a[l]);

//		System.out.println(Arrays.toString(a));

	}
}
