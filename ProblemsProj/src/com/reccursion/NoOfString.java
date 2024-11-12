package com.reccursion;

//20) IMP to count the number of times given string appeared in the original string?
//----------------------------------------------------------------------------------
//"python is very very easy programming" ----> 2
//"java is very easy" -----------------------> 1
//"c programming is easy" -------------------> 0

public class NoOfString {
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
