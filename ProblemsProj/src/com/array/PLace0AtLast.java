package com.array;

import java.util.Arrays;

public class PLace0AtLast {
	static int k = 0;

	static int[] placeLst(int[] a) {
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
				a[k++]=a[i];
		}
		while(k<a.length)
			a[k++]=0;
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 4, 5, 0, 1, 5, 2, 0, 4, 567, 0,0,3, 4, 8 };
//		Arrays.sort(a);
		System.out.println(Arrays.toString(placeLst(a)));
	}
}
