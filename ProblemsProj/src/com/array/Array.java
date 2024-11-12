package com.array;

import java.util.Scanner;

public class Array {
	static void getdata(int a[],int l) {
		if(l<=0)
			return;
		else 
		{
//			System.out.print(a[l-1]+" ");
			 getdata(a, l-1);
				System.out.print(a[l-1]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your array size");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("enter your array elements");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println();

		System.out.println("tour array items are");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();

		System.out.println("-----------------------------------");
		int i=0;
		while(i<n) {
			System.out.print(a[i]+" ");
			i++;
		}
		System.out.println();
		System.out.println("-----------------------------------");
		for(int q:a)
			System.out.print(q+" ");
		System.out.println();
		sc.close();
		System.out.println("-----------------------------------");
		int aa[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(aa.length);
		System.out.println();
		System.out.println("-----------------------------------1111111111111111");
		getdata(a, a.length);
	}
}
