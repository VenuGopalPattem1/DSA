package com.reccursion;

//19) IMP to replace the given old character with new character in the original string?

public class ReplaceCharInString {
	static int a=0;
	static String rev(String n,int i) {
		if(i<0)
			return "";
		else if(n.charAt(i)=='a')
			return rev(n,i-1)+"z";
		else
			return rev(n,i-1)+n.charAt(i);
	}

	public static void main(String[] args) {
		String n = "java is awesome aaaaa";
//		char s='1';
		System.out.println(rev(n,  n.length() - 1));
//		System.out.println(0<0);
	}
}
