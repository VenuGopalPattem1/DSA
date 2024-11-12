package com.reccursion;

//12) Implement a program to find LCM of two numbers?

public class LCM {
//	static int i = 1;

	static int lcm(int a, int b,int max) {
		
		if(max%a==0 && max%b==0)
			return max;
		else
			return lcm(a, b, max+1);
	}

	public static void main(String[] args) {
		int a = 24;
		int b = 36;
		int max=Math.max(a, b);
		System.out.println(lcm(a, b,max));
	}
}
