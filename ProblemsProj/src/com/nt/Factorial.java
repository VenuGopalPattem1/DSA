package com.nt;

public class Factorial {
	static void meth1(int x) {
		int val = 1;
		for (int i = 1; i <= x; i++)
			val = val * i;
		System.out.println("the factorial of the given number " + x + " is " + val);
	}

	static int rec(int x) {
		if (x == 1)
			return 1;
		else
			return x * rec(x - 1);
	}

	public static void main(String[] args) {
		int x = 5;
		meth1(x);
		System.out.println("-----------------------------------------------------------");
		System.out.println(rec(x));
	}
}
