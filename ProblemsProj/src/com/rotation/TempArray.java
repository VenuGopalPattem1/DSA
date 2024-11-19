package com.rotation;

import java.util.Arrays;
import java.util.Scanner;

public class TempArray {

	static int[] leftRotation(int[] a, int r) {
		r = r % a.length;
		int n = a.length;
		int[] temp = new int[r];
		for (int i = 0; i < r; i++) // this is loop is used to store the first no of elements in temp array
			temp[i] = a[i];
		for (int i = r; i < n; i++)// this loop is used to move the remaining elements into before places
			a[i - r] = a[i];
		for (int i = 0; i < r; i++)// this loop is used to insert the elements in temp array to original array at
									// last position
			a[i + n - r] = temp[i];
		return a;
	}

	static int[] rightRotation(int[] a, int r) {
		r = r % a.length;
		int i,n = a.length;
		int[] temp = new int[r];

		for (i = 0; i < r; i++)
			temp[i] = a[n - r + i];

		for (i = n - r - 1; i >= 0; i--)
			a[i + r] = a[i];

		for (i = 0; i < r; i++)
			a[i] = temp[i];

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
		System.out.println(Arrays.toString(rightRotation(a, r)));
		sc.close();
	}

}
