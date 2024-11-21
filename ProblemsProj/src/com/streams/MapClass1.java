package com.streams;

import java.util.List;

//Task : Print Emp Name with Emp age whose salary is >= 50,000 using Stream API.

public class MapClass1 {
	public static void main(String[] args) {
		Employee e1 = new Employee("John", 35, 55000.00);
		Employee e2 = new Employee("David", 25, 45000.00);
		Employee e3 = new Employee("Buttler", 35, 35000.00);
		Employee e4 = new Employee("Steve", 45, 65000.00);
		List<Employee> li = List.of(e1, e2, e3, e4);
		li.stream().filter(i -> i.salary >= 50000).map(i -> i.name + " and his age is " + i.age)
				.forEach(i -> System.out.println(i));
	}
}

class Employee {

	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}