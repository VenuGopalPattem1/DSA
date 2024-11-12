package com.array;

public class Sum {
	public static void main(String[] args) {
		int aa[][] = { { 1, 2, 3 }, { 4, 5, 6, 4757 }, { 7, 8, 9 } };
		System.out.println(aa[1].length);
		int[] a = { 10, 20, 304, 51, 64, 57, 64 };
		int q=0;
		int w=0;

		for (int i : a) {
			q+=i;
		}
		for(int i=0;i<a.length;i++)
			w+=a[i];
		System.out.println(q+" "+w);
	}
}
