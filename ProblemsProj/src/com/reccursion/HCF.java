package com.reccursion;

public class HCF {
	static int hcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
	}

	public static void main(String[] args) {
		int a = 36;
		int b = 24;
		System.out.println(hcf(a, b));
//		System.out.println(75%30);
	}
}
