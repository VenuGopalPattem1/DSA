package com.array;

import java.util.Arrays;

public class InsertFirst {
	static int[] insertFirst(int a[], int val) {
		int b[] = new int[a.length+1];
		int k=0;
		b[0]=val;
		for(int i=0;i<a.length;i++) {
			b[i+1]=a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		int a[]= {74,68,97,33,5,7};
		int val=45;
		System.out.println(Arrays.toString(insertFirst(a, val)));
	}
}
