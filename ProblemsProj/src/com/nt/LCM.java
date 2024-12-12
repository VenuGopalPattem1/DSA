package com.nt;

public class LCM {
	static int lcm(int a, int b) {
		int max = Math.max(a, b);
		while (true) {
			if (max % a == 0 && max % b == 0) {
				return max;
			}
			max++;
		}
	}

	static int hcf1(int a, int b) {
		int min = Math.min(a, b);
		while (true) {
			if (min % a == 0 && min % b == 0)
				return min;
			else
				min++;
		}
	}

	static int rec(int a, int b, int max) {
		if (max % a == 0 && max % b == 0)
			return max;
		else
			return rec(a, b, max + 1);

	}

	public static void main(String[] args) {
		int a = 12;
		int b = 15;
		System.out.println(lcm(a, b));
		System.out.println(hcf1(a, b));

		System.out.println(rec(a, b, Math.max(a, b)));

	}
}
