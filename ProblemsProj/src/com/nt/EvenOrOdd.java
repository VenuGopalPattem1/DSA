package com.nt;

public class EvenOrOdd {
	static void meth1(int x) {
		System.out.println((x%2==0)?"Even":"Odd");
	}
	public static void main(String[] args) {
		int x=1101;
		meth1(x);
	}
}
