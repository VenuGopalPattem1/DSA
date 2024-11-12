package com.reccursion;

//14.Implement a program to find reverse of the given string using recursion?

public class ReverceOfString {
	static String rev(String n,int l) {
		if(l<0)
			return "";
		else 
			return n.charAt(l)+rev(n, l-1);
	}
	public static void main(String[] args) {
		String n="venu";
//		String s=String.valueOf(n);
		System.out.println(rev(n,n.length()-1));
//		System.out.println(n.charAt(3));
	}
}
