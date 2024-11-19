package com.strings;

import java.util.Arrays;

public class DuplicatesFromStrArray {
	static int[] removeFromInt() {
		int[] a = { 1, 2, 3, 1, 4, 5, 7, 8, 9, 6, 5, 4, 3, 3 };
		int k = 0;
		Arrays.sort(a);
		for (int i = 1; i < a.length; i++) {
			if (a[k] != a[i]) {
				a[++k] = a[i];
			}
		}

		int o = k + 1;
		int[] t = new int[o];
		for (int i = 0; i < o; i++)
			t[i] = a[i];

		return t;
	}

	static String[] removeFromString() {
		String[] s = { "venu", "vinod", "vijaya", "venky", "veun1", "vinod", "vijaya" };
		int k = 0;
		Arrays.sort(s);
		for (int i = 1; i < s.length; i++) {
			if (!(s[k].equals(s[i]))) {
				s[++k] = s[i];
			}
		}
		int x = k + 1;
		String ss[] = new String[x];
		for (int i = 0; i < x; i++)
			ss[i] = s[i];
		return ss;
	}
	
	//we can do by using hashset
	//and also by using the linked hashset

	public static void main(String[] args) {

		System.out.println(Arrays.toString(removeFromString()));
	}

}
