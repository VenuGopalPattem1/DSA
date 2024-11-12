package com.reccursion;

//03. Implement a program to calculate a^b (a to the power b)

public class PoweOfN {

	static int power(int a, int b) {
		if (b >= 1)
			return a * power(a, b - 1);
		else
			return 1;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println(power(a, b));
	}
}
