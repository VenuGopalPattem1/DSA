package com.array;

import java.util.Arrays;

public class InsertLast {
	static int[] inserLast(int a[], int val) {
		int b[] = new int[a.length+1];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		b[a.length]=val;
		return b;
	}

	public static void main(String[] args) {
		int a[]= {74,68,97,33,5,7};
		int val=45;
		System.out.println(Arrays.toString(inserLast(a, val)));
	}
}
