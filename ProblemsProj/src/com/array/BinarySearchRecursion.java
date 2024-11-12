package com.array;

import java.util.Arrays;

public class BinarySearchRecursion {
	static int binary(int a[], int tar, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == tar)
				return mid;
			else if (a[mid] < tar)
				return binary(a, tar, mid + 1, high);
			else
				return binary(a, tar, low, mid - 1);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 74, 464, 89, 90, 39, 54, 67, 81, 12, 34, 55, 6, 3, 61, 61, 91 };
		int tar = 39;
		Arrays.sort(a);
		int low = 0;
		int high = a.length - 1;
		
		System.out.println(binary(a, tar, low, high));
		System.out.println(Arrays.toString(a));
//		if(h%2==0)
//			System.out.print(a[l]);

//		System.out.println(Arrays.toString(a));

	}
}
