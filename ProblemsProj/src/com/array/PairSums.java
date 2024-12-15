package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSums {
	static List<int[]> pairs(int[] a, int n) {
		List<int[]> res = new ArrayList<int[]>();
		Arrays.sort(a);
		int l = 0;
		int h = a.length - 1;
		while (l < h) {
			int sum = a[l] + a[h];
			if (sum == n) {
				res.add(new int[] { a[l], a[h] });
				l++;
				h--;
			} else if (sum < n)
				l++;
			else
				h--;
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 7, 8, -1 };
		int targetSum = 6+1;
		List<int[]> l = pairs(arr, targetSum);
		for (int[] i : l) {
			System.out.println(Arrays.toString(i));
		}
	}
}
