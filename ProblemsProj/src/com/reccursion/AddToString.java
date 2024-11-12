package com.reccursion;

//16.Implement a program to return a new String, where all the adjacent characters are seperated by a "*".

public class AddToString {
	static String rev(String n,int l) {
		if(l<0)
			return "";
		else 
			return rev(n, l-1)+n.charAt(l)+"*";
	}
	public static void main(String[] args) {
		String n="venugopal";
//		char s='1';
		System.out.println(rev(n,n.length()-1));
//		System.out.println(n.substring(8));
	}
}
