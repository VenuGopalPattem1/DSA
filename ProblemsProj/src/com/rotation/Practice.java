package com.rotation;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	static int[] leftRotation(int[] a,int r) {
		r=r%a.length;
		int n=a.length;
		int[] temp=new int[n];
		for(int i=0;i<a.length;i++)
			temp[(i+r)%n]=a[i];
		for(int i=0;i<a.length;i++)
			a[i]=temp[i];
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
