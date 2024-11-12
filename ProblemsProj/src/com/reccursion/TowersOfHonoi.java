package com.reccursion;

public class TowersOfHonoi {
	static void towersOfHonoi(int n, String src, String helper, String dest) {
		if (n == 1) {
			System.out.println(" Move the Disk " + n + "  from " + src + " to " + dest);
			return;
		} else
			towersOfHonoi(n - 1, src, dest, helper);
		System.out.println(" Move the Disk " + n + "  from " + src + " to " + dest);
		towersOfHonoi(n - 1, helper, src, dest);

	}

	public static void main(String[] args) {
		int n = 3;
		towersOfHonoi(n, "S", "H", "D");
	}
}
