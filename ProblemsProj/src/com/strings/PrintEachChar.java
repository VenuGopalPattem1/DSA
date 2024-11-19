package com.strings;

//01. Impl prg to read str and print char and corresponding index value.

public class PrintEachChar {
	public static void main(String[] args) {
		String s = "my name is venu gopla pattem";
		for (int i = 0; i < s.length(); i++) {
			if(!(i%2==0))
				System.out.println("character at " + i + " is =======> " + s.charAt(i));
		}
			
	}
}
