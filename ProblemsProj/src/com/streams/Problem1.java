package com.streams;

import java.util.List;

public class Problem1 {
	public static void main(String[] args) {
		User u1 = new User("Anushka", 25);
		User u2 = new User("Smith", 30);
		User u3 = new User("Raju", 15);
		User u4 = new User("Rani", 10);
		User u5 = new User("Charles", 35);
		User u6 = new User("Ashok", 30);
		List<User> al=List.of(u1, u2, u3, u4, u5, u6);
		al.stream().filter(i->i.name.startsWith("A")&&i.age>=10).forEach(i->System.out.println(i));
	}
}

class User {

	String name;
	int age;

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}