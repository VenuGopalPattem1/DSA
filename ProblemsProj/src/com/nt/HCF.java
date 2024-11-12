package com.nt;

public class HCF {
	static int hcf(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	static int rec(int a, int b) {
		if (b == 0)
			return a;
		else
			return rec(b, a % b);
	}



	public static void main(String[] args) {
		int a = 54;
		int b = 18;
		System.out.println(hcf(a, b));
		System.out.println(rec(a, b));
//		System.out.println(hcf1(a, b));

	}
}
