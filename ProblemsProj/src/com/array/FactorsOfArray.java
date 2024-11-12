package com.array;

public class FactorsOfArray {
	static void factors(int a, int l) {
		if (a/2< l)
		{
			System.out.println(a + " ===> " + a);
			return;
		}
		if (a % l == 0)
			System.out.println(a + " ===> " + l);
		factors(a, l + 1);
	}

	public static void main(String[] args) {
		int[] a = { 5, 3, 4, 6, 8, 8, 100, 44};
//		for(int i:a)
//			factors(i, a.length);
		for(int i=0;i<a.length;i++) {
			factors(a[i], 1);
			System.out.println("-------------------------------------------------");
		}
		
	}
}
