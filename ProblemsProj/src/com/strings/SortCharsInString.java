package com.strings;

import java.util.Arrays;

//05. Impl prg to sort all the characters in asc/desc order.

public class SortCharsInString {
public static void main(String[] args) {
	String s="java is highlevel programming languaue";
	char[] c=s.toCharArray();
	Arrays.sort(c);
	System.out.println(s);
	System.out.println(new String(c));
}
}
