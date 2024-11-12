package com.reccursion;

//11. Implement a program to find nth fib number.

public class Febnocci {
	static int feb(int n) {
		if(n==0||n==1)
			return n;
		else
			return feb(n-1)+feb(n-2);
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(feb(n));

		System.out.println("==========================");
		for(int i=0;i<=n;i++)
			System.out.print(feb(i)+" ");
	}
}
