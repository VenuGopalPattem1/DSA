package com.nt;

public class Prime {
	static void meth1(int x) {
		int a = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0)
				a++;
		}
		System.out.println((a == 2) ? "prime" : "not a prime");
	}

	static boolean meth2(int x) {
		if (x < 2)
			return false;
		else {
			for (int i = 2; i < x; i++) {
				if (x % i == 0)
					return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		int x = 199;
		meth1(x);
		System.out.println("=====================================");
		System.out.println(meth2(x)?"prime":"not a prime");
	}
}
