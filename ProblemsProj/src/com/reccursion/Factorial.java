package com.reccursion;

//4. Implement a program to find factorial of the given number?

public class Factorial {
	
	static int fact(int n) {
		if (n <=0)
			return 1;
		else
			return n * fact(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fact(n));
	}
}
