package com.interview;

public class ClassC extends ClassB {
	public void meth1(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		ClassB b=new ClassC();
		b.meth1(10,20);
	}
}
