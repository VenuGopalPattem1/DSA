package com.reccursion;

//14.Implement a program to find reverse of the given string using recursion?

public class RemoveFromString {
	static String rev(String n,int l,char s) {
		if(l<0)
			return "";
		else if(n.charAt(l)==s)
			return rev(n,l-1,s);
		else 
			return rev(n, l-1,s)+n.charAt(l);
	}
	public static void main(String[] args) {
		String n="ven1uv111111ino1111d";
		char s='1';
		System.out.println(rev(n,n.length()-1,s));
//		System.out.println(0<0);
	}
}
