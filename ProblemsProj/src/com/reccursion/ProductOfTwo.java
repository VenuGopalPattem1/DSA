package com.reccursion;

//Implement a program to calculate product of two integer values (a*b)

public class ProductOfTwo {

	static int prod(int a,int b) {
		if(a<b)
			return prod(b, a);
		else if(b!=0)
			return a+prod(a, b-1);
		else 
			return 0;
	}

	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println(prod(a,b));
	}
}
