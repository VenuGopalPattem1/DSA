package com.reccursion;

//08.Implement a program to calcualte reverse of the given number?

public class ReverceOfNum {
	static int rev(int n,int l) {
		if(n==0)
			return 0;
		else 
			return (int) ((n%10*Math.pow(10, l))+rev(n/10, l-1));
	}
	public static void main(String[] args) {
		int n=89;
		String s=String.valueOf(n);
		System.out.println(rev(n,s.length()-1));
	}
}
