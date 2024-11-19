package com.rotation;

import java.util.Arrays;
import java.util.Scanner;

public class UsingTempVariable {

	 static int[] leftRotation(int[] a, int r) {
		r=r%a.length;
		int temp;
		for(int i=0;i<r;i++) {
			temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		return a;
	}
	
	 static int[] rightRotation(int[] a, int r) {
		r=r%a.length;
		int temp;
		for(int i=0;i<r;i++) {
			temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
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
