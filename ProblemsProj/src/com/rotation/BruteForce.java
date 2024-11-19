package com.rotation;

import java.util.Arrays;
import java.util.Scanner;

public class BruteForce {
	static int[] leftRotation(int[] a, int r) {
		for (int i = 0; i < r % a.length; i++) {
			int prev = a[0];
			for (int j = a.length - 1; j >= 0; j--) {
				int temp = a[j];
				a[j] = prev;
				prev = temp;
			}
		}
		return a;
	}

	static int[] rightRotation(int[] a, int r) {
		for (int i = 0; i < r % a.length; i++) {
			int prev = a[a.length-1];
			for (int j = 0; j < a.length; j++) {
				int temp = a[j];
				a[j] = prev;
				prev = temp;
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
		System.out.println("enter the no of rotations");
		int r = sc.nextInt();
		System.out.println("this is the before rotation");
		System.out.println(Arrays.toString(a));
		System.out.println("this is the after rotation");
		System.out.println(Arrays.toString(leftRotation(a, r)));
		sc.close();
	}
}
