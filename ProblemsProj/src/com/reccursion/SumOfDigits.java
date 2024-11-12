package com.reccursion;

//07. Implement a program to find sum of digits present in the given number?

public class SumOfDigits {
	static int sum(int n) {
		if(n==0)
			return 0;
		else
			return (n%10)+sum(n/10);
	}

	public static void main(String[] args) {
		int n=1345;
		System.out.println(sum(n));
	}
}
