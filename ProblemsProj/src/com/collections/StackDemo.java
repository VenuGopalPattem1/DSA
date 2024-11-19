package com.collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<Integer> v=new Stack<Integer>();
	v.add(77);
	v.add(17);
	v.add(27);
	v.add(37);
	v.add(87);
	Enumeration<Integer> e=v.elements();
	while(e.hasMoreElements())
		System.out.print(e.nextElement()+" ");
	System.out.println();
	System.out.println("------------------------------------------");
	System.out.println(v.push(10));
	System.out.println(v);
}
}
