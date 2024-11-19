package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	public static void main(String[] args) {

		ArrayList<Student> ll = new ArrayList<>();

		ll.add(new Student(1, "ramya", "sangam"));
		ll.add(new Student(7, "janu", "east blue"));
		ll.add(new Student(9, "dinu", "marine"));
		ll.add(new Student(3, "luffffy", "wano"));
		ll.add(new Student(4, "zoro", "punk hazard"));

		for (Student st : ll)
			System.out.println(st + " ");
		System.out.println("------------------------------------");

		// Sort the collection
		Collections.sort(ll);

		for (Student st : ll)
			System.out.println(st + " ");
		System.out.println("------------------------------------");
		// Reverse the collection
		Collections.reverse(ll);

		for (Student st : ll)
			System.out.println(st + " ");
	}

}
