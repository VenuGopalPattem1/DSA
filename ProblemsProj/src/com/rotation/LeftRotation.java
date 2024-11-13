package com.rotation;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
	static int[] rotate(int[] a, int r) {
		for (int i = 0; i < r%a.length; i++) {
			int temp=a[0];
			for(int j=a.length-1;j>=0;j--) {
				int prev=a[j];
				a[j]=temp;
				temp=prev;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter array elements");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println("enter no of rotations");
		int r = sc.nextInt();

		System.out.println(Arrays.toString(rotate(a, r)));
		System.out.println(Arrays.toString(a));

	}
}
