package com.strings;

import java.util.Arrays;

//07. Impl prg to check whether the given str is paliandrome or not.

public class Palindrome {
	static void reverse(String s) {
		String a="";
		for(int i=s.length()-1;i>=0;i--) {
			a+=s.charAt(i);
		}
		System.out.println(a);
		System.out.println(s.equals(a));
	}
	public static void main(String[] args) {
		String s1 = "carrac";

		reverse(s1);
	}
}
