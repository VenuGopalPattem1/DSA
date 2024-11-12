package com.reccursion;

//06. Implement a program to check whether the given number is prime number or not?

public class Prime {
	static boolean prime(int n,int half) {
		if(half==1)
			return true;
		else if(half==0 || n%half==0)
			return false;
		else
			return prime(n, --half);
	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println(prime(n,n/2)?"prime":"not a prime");
	}
}
