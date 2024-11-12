package com.array;

public class Factorialjava {
	static int fact(int a) {
		if (a == 0)
			return 1;
		else
			return a * fact(a - 1);
	}

	public static void main(String[] args) {

		int[] a = { 1, 4, 5, 6, 7, 3 };
		int q = 0;
		for (int i = 0; i < a.length; i++)
			q += fact(a[i]);
		System.out.println(q);
//		System.out.println(fact(10));
	}
}
