package com.strings;

import java.util.StringTokenizer;

//08. Impl prg to check whether the given str is pangram or not.

//09. Impl prg to divide the strings seperated by spaces/comma/-.

//14. Impl prg to convert every word first char into caps.

//15. Impl prg to convert every word first and last char into caps.

//16. Impl prg to convert except first and last chars, remaining into upper case.

public class Panagram {
	
	public static void main(String[] args) {
		String s1 = "the quick brown 1234 fox jumps over lazy dog";
		boolean b=true;
		for(int i='a';i<='z';i++) {
			if(s1.indexOf(i)<0) {
				b=false;
				break;
			}
		}
		System.out.println(b);
		
		StringTokenizer st=new StringTokenizer(s1);
		while(st.hasMoreTokens()) {
			String s=String.valueOf(st.nextElement());
			System.out.print(s.substring(0,1)+s.substring(1,s.length()-1).toUpperCase()+s.substring(s.length()-1,s.length())+" ");
		}
		System.out.println();
		System.out.println(s1.contains("1234"));
	}
}
