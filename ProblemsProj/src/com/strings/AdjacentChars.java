package com.strings;

public class AdjacentChars {
	public static void main(String[] args) {
		String s = "vveenuu goopal";
		String a = "";
		a = String.valueOf(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) == s.charAt(i)) {
				a += "*";
			}
			a += s.charAt(i);
		}
		System.out.println(a);
	}
}
