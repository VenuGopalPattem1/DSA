package com.collections;

public class Student1  {
	int id;
	String name;
	String village;

	public Student1(int id, String name, String village) {
		super();
		this.id = id;
		this.name = name;
		this.village = village;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", village=" + village + "]";
	}


}
