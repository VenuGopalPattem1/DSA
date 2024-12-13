package com.strings;

public class CheckedBalanceParathesis {
	static boolean m(String s) {
		int  l=0;
		int h=s.length()-1;
		while(l<=h) {
			if(s.charAt(l)=='('&&s.charAt(h)==')')
			{
				l++;
				h--;
			}else
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="((()))";
		System.out.println(m(s));
	}
}
