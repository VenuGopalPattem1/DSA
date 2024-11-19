package com.strings;

import java.util.Arrays;

//06. Impl prg to check whether the given strs are anagrams or not.

public class Anagram {
public static void main(String[] args) {
	String s1="java is highlevel programming languaue";
	String s2="java is highlevel programming languaue";
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);

	System.out.println(Arrays.equals(c1, c2));
}
}
