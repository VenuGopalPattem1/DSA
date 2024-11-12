package com.array;

import java.util.Arrays;

public class RemoveDuplicates {
	static int duplicate(int[] a) {
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[k]!=a[i]) {
				k++;
				a[k]=a[i];
			}
		}
		return k+1;
	}
	public static void main(String[] args) {
		int[] a= {33,55,44,55,55,53,2,1,1,1,2};
		Arrays.sort(a);
		int k=duplicate(a);
		for(int i=0;i<k;i++) {
			System.out.print(a[i]+" ");
		}

	}
}
