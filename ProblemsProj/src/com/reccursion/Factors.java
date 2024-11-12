package com.reccursion;

public class Factors {
	static void factors(int n, int i) {
		if (n < i)
			return;
		if (n % i == 0)
			System.out.print(i + " ");
		factors(n, i + 1);
	}

	public static void main(String[] args) {
		int n = 50;
		int i = 1;
		factors(n, i);
	}
}
