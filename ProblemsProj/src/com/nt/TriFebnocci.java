package com.nt;

public class TriFebnocci {
	static void meth1() {
		int a=0,b=1,c=1;
		System.out.print(a+" "+b+" "+c+" ");
		for(int i=1;i<=10;i++) {
			int d=a+b+c;
			System.out.print(d+" ");
			a=b;
			b=c;
			c=d;
		}
	}

	public static void main(String[] args) {
//		int x = 7;
		meth1();
	}
}
