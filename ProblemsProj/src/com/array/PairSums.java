package com.array;

import java.util.Arrays;

public class PairSums {
	static int[] pairs(int[] a, int t) {
//		int n=a.length;
//		Arrays.sort(a);
		int[] q = new int[2];
		int l = 0;
		int h = a.length - 1;
		while (l < h) {
			int sum = a[l] + a[h];
			if (sum == t) {
				q[0] = l;
				q[1] = h;
				l++;
				h--;
			} else if (sum < t) {
				l++;
			} else {
				h--;
			}
		}
		return q;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4 };
		int targetSum = 6;
		int[] l = pairs(arr, targetSum);
		System.out.println(Arrays.toString(l));
	}
}
