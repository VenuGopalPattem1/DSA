package com.strings;

import java.util.StringTokenizer;

public class CountWords {
	public static void main(String[] args) {
		String m1 = "java is awesomw and vey hard ro            learn and                 not bad";
		String m2="python";
		StringTokenizer st=new StringTokenizer(m1);

		System.out.println(st.countTokens());

		String a=m1+m2;
		System.out.println(m1+" "+m2);
//		System.out.println(Arrays.toString(s));
//		System.out.println(new StringBuffer(msg).reverse());

		m2=a.substring(0,m1.length());
		m1=a.substring(m2.length());
		System.out.println(m1+" "+m2);
	}
}
