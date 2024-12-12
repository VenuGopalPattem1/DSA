package com.strings;

public class Duplicates {
	public static void main(String[] args) {
		String s1 = "abbdaccda";
		String a="";
		for(int i=0;i<s1.length();i++) {
			if(a.indexOf(s1.charAt(i))<0)
				a+=s1.charAt(i);
		}
		System.out.println(a);
		System.out.println();
		int n=s1.length();
				if(n%2==0)
					System.out.println(s1.charAt(n/2-1)+" "+s1.charAt(n/2));
				else
					System.out.println(s1.charAt(n/2));
	}
}
