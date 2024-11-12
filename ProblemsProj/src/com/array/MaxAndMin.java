package com.array;

import java.util.Arrays;

public class MaxAndMin {
	static void v1(int a[]) {
		int l=a.length;
		int max=a[0];
		int min=a[0];
		for(int i=0;i<l;i++) {
			if(a[i]>max)
				max=a[i];
		}
		
		for(int i=0;i<l;i++) {
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(max+" is the max element");
		System.out.println(min+" is the min element");
		System.out.println("-------------------------------------");
	}
	
	static void v2(int a[]) {
		Arrays.sort(a);
		System.out.println(a[a.length-1]+" is the max element");
		System.out.println(a[0]+" is the min element");
	}

	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 6, 7, 3 };
//		int q = 0;
		v1(a);
		v2(a);
	}
}
