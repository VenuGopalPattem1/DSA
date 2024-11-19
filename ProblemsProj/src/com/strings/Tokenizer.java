package com.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {
	static void date() {
		String a = "23-13-23";
		StringTokenizer st = new StringTokenizer(a, "-");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
	
	static void time() {
		String a = "11:45:56";
		StringTokenizer st = new StringTokenizer(a, ":");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "my name is venu gopla pattem iam from snagma village";
//		System.out.println(Arrays.toString(s));
		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("--------------------------------");
		date();
		System.out.println("--------------------------------");
		time();
		sc.close();
	}
}
