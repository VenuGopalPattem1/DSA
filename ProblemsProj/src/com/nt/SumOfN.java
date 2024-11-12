package com.nt;

public class SumOfN {
	static void meth1(int x) {
		int val=0;
		for(int i=1;i<=x;i++)
			val+=i;
		System.out.println("sum of first "+x+" natural numbers are "+val);
	}
	
	static int rec(int x) {
		if(x==1)
			return 1;
		else 
			return x+rec(x-1);
	}
	
	static void meth2(int x) {
		int val=(x*(x+1)/2);
		System.out.println("sum of first "+x+" natural numbers are "+val);

	}

	public static void main(String[] args) {
		int x=80;
		meth1(x);
		System.out.println("--------------------------------------------------------");
		System.out.println(rec(x));
		System.out.println("--------------------------------------------------------");
		meth2(x);
		
	}
}
