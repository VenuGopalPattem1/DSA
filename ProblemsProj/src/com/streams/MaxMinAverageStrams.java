package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxMinAverageStrams {
	public static void main(String[] args) {

		Employe e1 = new Employe(1, "Robert", 26500.00);
		Employe e2 = new Employe(2, "Abraham", 46500.00);
		Employe e3 = new Employe(3, "Ching", 36500.00);
		Employe e4 = new Employe(4, "David", 16500.00);
		Employe e5 = new Employe(5, "Cathy", 25500.00);
		List<Employe> l = List.of(e1, e2, e3, e4, e5);
		Optional<Employe> j = l.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println(j.get());
		Optional<Employe> ja = l.stream().collect(Collectors.minBy(Comparator.comparing(i -> i.salary)));
		System.out.println(ja.get());
		Double m = l.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println(m);
	}
}

class Employe {
	int id;
	String name;
	double salary;

	public Employe(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}