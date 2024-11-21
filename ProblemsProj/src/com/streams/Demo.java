package com.streams;

public class Demo {
	Demo(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
//		Demo d=new Demo();
		InterfaceA a = Demo::new;
		a.meth1(10, 20);
		;
	}

}

@FunctionalInterface
interface InterfaceA {
	void meth1(int a, int b);
//	int meth2(int a,int b);

}