package com.array;

import java.util.Arrays;

public class Practice {
	static int equals(int[] a) {
		int k = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[k] != a[i]) {
				a[++k] = a[i];
			}
		}
		return k + 1;
	}

	public static void main(String[] args) {
		int[] a = { 1,3,6,7,0,4,6,0,4,0,8,5,0,4};
//		int[] b = { 231, 34, 56, 6,17, 8, 991, 12, 13, 14 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("-----------------------------------");
		int k=(equals(a));
		System.out.println("-----------------------------------");
		for(int i=0;i<k;i++) 
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.println(Arrays.toString(a));
	}
}
