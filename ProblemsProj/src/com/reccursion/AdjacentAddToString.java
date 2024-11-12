package com.reccursion;

//17) Implement a program to return new string where identical adjcent chars are sep by *

public class AdjacentAddToString {
	static String rev(String n,int l) {
		if(l<1)
			return String.valueOf(n.charAt(l));
		else if(n.charAt(l-1)==n.charAt(l))
			return rev(n,l-1)+"*"+n.charAt(l);
		else 
			return rev(n, l-1)+n.charAt(l);
	}
	public static void main(String[] args) {
		String n="venuu";
//		char s='1';
		System.out.println(rev(n,n.length()-1));
//		System.out.println(0<0);
	}
}
