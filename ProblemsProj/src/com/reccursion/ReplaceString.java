package com.reccursion;

//21) IMP to replace the given string with new string?

public class ReplaceString {
//	static int a=1;
	static int rev(String n,int i) {
		if(i<1)
			return 0;
		else if(n.substring(i-1,i+1).equals("is"))
			return 1+rev(n,i-1);
		else
			return rev(n,i-1);
	}

	public static void main(String[] args) {
		String n = "java is is very is hign is level is prog";
//		char s='1';
		System.out.println(rev(n, n.length() - 1));
//		System.out.println(n.substring(14));
	}
}
