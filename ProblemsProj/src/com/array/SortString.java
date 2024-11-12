package com.array;

public class SortString {
	public static void main(String[] args) {
		String s = "aqyrogplmdbxdewrwurighnvdqwq";
		System.out.println(s);
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char t = c[i];
					c[i] = c[j];
					c[j] = t;
				}
			}
		}
		System.out.println(new String(c));
	}
}
