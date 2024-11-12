package com.nt;

public class Swap {

	static void meth1(int a, int b) {
		System.out.println("before swap A : " + a + " B : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("after swap A : " + a + " B : " + b);
	}

	static void meth2(int a, int b) {
		System.out.println("before swap A : " + a + " B : " + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("after swap A : " + a + " B : " + b);
	}

	static void meth3(int a, int b) {
		System.out.println("before swap A : " + a + " B : " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swap A : " + a + " B : " + b);
	}

	static void meth4(int a, int b) {
		System.out.println("before swap A : " + a + " B : " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after swap A : " + a + " B : " + b);
	}

	static void meth5(int a, int b) {
		System.out.println("before swap A : " + a + " B : " + b);
		a = (a + b) - (b = a);
		System.out.println("after swap A : " + a + " B : " + b);
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		meth1(x, y);
		System.out.println("----------------------------------------");
		meth2(x, y);
		System.out.println("----------------------------------------");
		meth3(x, y);
		System.out.println("----------------------------------------");
		meth4(x, y);
		System.out.println("----------------------------------------");
		meth5(x, y);

	}
}
