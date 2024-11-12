package com.reccursion;

//02. Implement a program to calculate sum of 'n' natural numbers

public class SumOfNnum {

	static int rec1(int n) {
		if (n == 0)
			return 0;
		else
			return n + rec1(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(rec1(n));
	}
}
