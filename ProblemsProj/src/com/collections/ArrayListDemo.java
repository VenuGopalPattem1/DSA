package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	/*
	 * ArrayList it is an implementation of list interface , it allows duplicate
	 * values ,it maintains the insertion order it allows both homogenous and
	 * heterogenous data, it allows null values its default capacity is 10 after the
	 * default space is occupied the size will increase by hals , its internal data
	 * structure is growable array or dynamic array
	 * it is good for select operation not good for update operations
	 * 
	 */
	public static void main(String[] args) {
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add(400);
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		al.addAll(0, al1);
		System.out.println(al);
//		Collections.sort(al);
		Iterator<Integer> i = al.iterator();
		while (i.hasNext())
			System.out.print(i.next() + " ");
		System.out.println();
		ListIterator<Integer> li = al.listIterator();
		while (li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println();
		while (li.hasPrevious())
			System.out.print(li.previous() + " ");
		System.out.println();
		System.out.println("-------------------------------------------------");
		for (Integer in : al)
			System.out.print(in + " ");
		System.out.println();
		System.out.println("-------------------------------------------------");
		for (int j = 0; j < al.size(); j++)
			System.out.print(al.get(j) + " ");
		System.out.println();
		System.out.println("-------------------------------------------------");
		al.forEach((a) -> {
			System.out.print(a + " ");
		});
		System.out.println();
		al.remove(2);
		System.out.println(al);
	}
}
