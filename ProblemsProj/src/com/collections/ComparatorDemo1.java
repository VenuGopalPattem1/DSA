package com.collections;

import java.util.Comparator;

public class ComparatorDemo1 implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.village.compareTo(o2.village);
	}

}
