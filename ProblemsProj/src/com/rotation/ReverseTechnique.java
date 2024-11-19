package com.rotation;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTechnique {
	static void rev(int[] a, int s, int e) {
		while (s < e) {
			int temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;
			e--;
		}
	}

	static int[] leftRotation(int[] a, int r) {
		r = r % a.length;
		int n = a.length;
		rev(a, 0, r - 1);
		rev(a, r, n - 1);
		rev(a, 0, n - 1);
		return a;
	}

	static int[] rightRotation(int[] a, int r) {
		r = r % a.length;
		int n = a.length;
		rev(a,0,n-1);
		rev(a,0,r-1);
		rev(a,r,n-1);
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
		System.out.println("enter the no of rotations");
		int r = sc.nextInt();
		System.out.println("this is the before rotation");
		System.out.println(Arrays.toString(a));
		System.out.println("this is the after rotation");
		System.out.println(Arrays.toString(leftRotation(a, r)));
		sc.close();
	}

}
