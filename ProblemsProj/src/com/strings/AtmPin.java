package com.strings;

public class AtmPin {
	public static void main(String[] args) {
		String s = "TS12AB1234";
		System.out.println(s.matches("TS\\d{2}[A-Z]{2}[0-9]{4}"));

	}
}
