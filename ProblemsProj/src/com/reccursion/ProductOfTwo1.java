package com.reccursion;

//Implement a program to calculate product of two integer values (a*b)

public class ProductOfTwo1 {

	static int prod(int a,int b) {
		if(b==0)
			return 0;
		else
			return a+prod(a, b-1);
	}

	public static void main(String[] args) {
		int a=8;
		int b=8;
		System.out.println(prod(a,b));
	}
}
