package com.reccursion;

//01. Implement a program to print natural numbers from 1 to n

public class Num1toNatural {
	static void natural(int n) {
		if (n >= 1) {
//			System.out.println(n);
			natural(n - 1);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		natural(10);
	}
}
