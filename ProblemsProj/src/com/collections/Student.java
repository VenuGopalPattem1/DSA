package com.collections;

public class Student implements Comparable<Student> {
	int id;
	String name;
	String village;

	public Student(int id, String name, String village) {
		super();
		this.id = id;
		this.name = name;
		this.village = village;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", village=" + village + "]";
	}

	@Override
	public int compareTo(Student s) {
//		return this.id - s.id;
//		return this.name.compareTo(s.name);
		return this.village.compareTo(s.village);

	}

}
