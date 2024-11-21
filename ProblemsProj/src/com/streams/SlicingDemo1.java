package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SlicingDemo1 {
	public static void main(String[] args) {

		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "JAPAN");
		Person p3 = new Person("Ashok", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		Person p5 = new Person("Kumar", "INDIA");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);

//		List<Person> p=persons.stream().filter(i->i.country.equalsIgnoreCase("india")).collect(Collectors.toList());

		// collect names of persons who are belongs to india and store into names
		// collection
		List<String> p = persons.stream().filter(i -> i.country.equalsIgnoreCase("india")).map(i -> i.name)
				.collect(Collectors.toList());
		p.forEach(i -> System.out.println(i));
		System.out.println("-----------------------------------------------");
		Optional<String> s=persons.stream().findFirst().map(i->i.name);
		System.out.println(s.get());
		Map<String, List<Person>> m=persons.stream().collect(Collectors.groupingBy(e->e.country));
		System.out.println(m);
	}
}

class Person {

	String name;
	String country;

	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}

}