package com.reccursion;

//09.Implement a program to count number of digits present in the given number

public class NoOfDigits {
	static int count=0;
	static int sum(int n) {
		if(n!=0) {
			count++;
			return sum(n/10);
		}
		return count==0?1:count;
	}

	public static void main(String[] args) {
		int n=4400;
		System.out.println(sum(n));
	}
}
