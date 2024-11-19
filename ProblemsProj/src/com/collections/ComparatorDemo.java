package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
	public static void main(String[] args) {

		ArrayList<Student1> ll = new ArrayList<>();

		ll.add(new Student1(1, "ramya", "sangam"));
		ll.add(new Student1(7, "janu", "east blue"));
		ll.add(new Student1(9, "dinu", "marine"));
		ll.add(new Student1(3, "luffffy", "wano"));
		ll.add(new Student1(4, "zoro", "punk hazard"));

		for (Student1 st : ll)
			System.out.println(st + " ");
		System.out.println("------------------------------------");

		// Sort the collection
		Collections.sort(ll,new ComparatorDemo1());
		Collections.sort(ll,new ComparatorDemo2());


		for (Student1 st : ll)
			System.out.println(st + " ");
		System.out.println("------------------------------------");
		// Reverse the collection
		Collections.reverse(ll);

		for (Student1 st : ll)
			System.out.println(st + " ");
	}

}
