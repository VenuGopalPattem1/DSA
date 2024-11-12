package com.nt;

public class Febnocci {
	static void meth1() {
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=10;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
//		int x = 7;
		meth1();
	}
}
