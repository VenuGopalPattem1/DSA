package com.reccursion;

//18) Implement a program to count number of times, the give char occurred.

public class NoOfChars {
	static int a=0;
	static int rev(String n,int i) {
		if(i<0)
			return a;
		else if(n.charAt(i)=='s')
		{
			a++;
			return rev(n,i-1);
		}
		else
			return rev(n,i-1);
	}

	public static void main(String[] args) {
		String n = "java is awesome aaaaa";
//		char s='1';
		System.out.println(rev(n,  n.length() - 1));
//		System.out.println(0<0);
	}
}
