package com.interview;

public class Venu implements InterfaceA {

		@Override
		public void meth1() {
		    System.out.println("hello world");
		}
		
		public static void main(String[] args) {
			new Venu().meth1();
		}
	}
