package com.strings;

import java.util.StringTokenizer;

public class LongestWord {
	public static void main(String[] args) {
		String s = "my name is venu  gopla  pattem iam from snagma village anamsanjee nelloree";
		int t=0;
		String token=null;
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			String ss=st.nextToken();
			if(ss.length()>t) {
				t=ss.length();
				token=ss;
				System.out.println(ss);
			}
		}
//		System.out.println(token);
	}
}
