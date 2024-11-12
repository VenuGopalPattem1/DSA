package com.reccursion;

public class Hello {
	 static int c=0;
	static void hello() {
		if(c>10)
			return;
		else {
			System.out.println("hellow world "+c);
			c++;
			hello();
		}
	}
	public static void main(String[] args) {
		hello();
	}
}
