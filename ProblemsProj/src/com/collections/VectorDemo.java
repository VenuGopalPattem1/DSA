package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<Integer>();
	v.add(77);
	v.add(17);
	v.add(27);
	v.add(37);
	v.add(87);
	Enumeration e=v.elements();
	while(e.hasMoreElements())
		System.out.print(e.nextElement()+" ");
}
}
