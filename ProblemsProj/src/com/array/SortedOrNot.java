package com.array;

import java.util.Arrays;

public class SortedOrNot {
	static boolean sort(int[] a ) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] c = { 1, 2, 3, 4, 12, 0, 5, 6, 7, 8, 9 };
		Arrays.sort(c);
		System.out.println(sort(c));
	}
}
