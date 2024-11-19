package com.strings;

//03. Impl prg to print vowels/consonants present in the given str.

public class OvelsInString {
	public static void main(String[] args) {
		String s = "my name is venu gopla pattem";
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if((c=='a'||c=='e'|c=='i'||c=='o'||c=='u'))
				System.out.println("character at " + i + " is =======> " + s.charAt(i));
		}
			
	}
}
