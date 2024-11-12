package com.reccursion;

//10. Implement a program to convert decimal number into binary?

public class DecimalToBinary {
	static int binary(int n) {
		if (n == 0)
			return 0;
		else
			return n % 2 + (10 * binary(n / 2));
	}

	static void binary1(int n) {

		if(n!=0)
		{
			binary1(n/2);
			System.out.print(n%2);
		}

	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println(binary(n));
		binary1(n);
	}
}
