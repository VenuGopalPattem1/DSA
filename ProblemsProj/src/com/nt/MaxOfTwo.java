package com.nt;

public class MaxOfTwo {

	static void meth1(int x, int y) {
		System.out.println((x > y) ? x : y + "  is the max number ");
	}

	static void meth2(int x, int y, int z) {
		System.out.println((x > y && x > z) ? x : (y > z) ? y : z + "  is the max number ");
	}
	
	static void meth3(int x, int y, int z) {
		System.out.println(Math.max(x, Math.max(y, z) )+"  is the max number ");
	}
	
	static void meth4(int x, int y) {
		System.out.println(Math.max(y, y) +"  is the max number ");
	}

	public static void main(String[] args) {
		int x = 1001;
		int y = 2001;
		int z = 3001;
		meth1(x, y);
		System.out.println("--------------------------------------------");
		meth2(x, y, z);
		System.out.println("--------------------------------------------");
		meth3(x, y, z);
		System.out.println("--------------------------------------------");
		meth4(x, y);
	}
}
