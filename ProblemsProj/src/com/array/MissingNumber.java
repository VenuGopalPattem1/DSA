package com.array;

public class MissingNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5 };
		int n=5;
		int q=n*(n+1)/2;
		int t=0;
		for(int s:a)
			t+=s;
		System.out.println(q-t);
	}
}
