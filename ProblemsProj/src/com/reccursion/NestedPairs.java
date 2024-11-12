package com.reccursion;

//18) Implement a program to return true if a string nesting of zero or more pairs of ()
//
//"()" ----> true
//"(())" --> true
//"((((" --> false

public class NestedPairs {
	static boolean rev(String n,int i,int j) {
		if(i>j)
			return true;
		else if(n.charAt(i)=='('&& (n.charAt(j)==')'))
		return rev(n, i+1, j-1);
		else 
			return false;
	}

	public static void main(String[] args) {
		String n = "()";
//		char s='1';
		System.out.println(rev(n, 0, n.length() - 1));
//		System.out.println(0<0);
	}
}
