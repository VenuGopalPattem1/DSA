package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Challenge {
	public static void main(String[] args) {
		List<Emp> EmpList = new ArrayList<Emp>();

		EmpList.add(new Emp(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		EmpList.add(new Emp(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		EmpList.add(new Emp(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		EmpList.add(new Emp(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		EmpList.add(new Emp(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		EmpList.add(new Emp(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		EmpList.add(new Emp(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		EmpList.add(new Emp(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		EmpList.add(new Emp(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		EmpList.add(new Emp(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		EmpList.add(new Emp(11, "Gouri", 27, "Female", "Infrastructure", 2014, 105700.0));
		EmpList.add(new Emp(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		EmpList.add(new Emp(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		EmpList.add(new Emp(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		EmpList.add(new Emp(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		EmpList.add(new Emp(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

//		1. How many male and female employees are there in the organization ?
		Map<String, Long> m = EmpList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));
		System.out.println(m);

		System.out.println("------------------------------------");

//		2.Print the name of all departments in the organization ?
		EmpList.stream().map(i -> i.department).distinct().forEach(i -> System.out.println(i));

//      3. What is the average age of male and female employees ?
		System.out.println("------------------------------------");
		Map<String, Double> s = EmpList.stream()
				.collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingDouble(e -> e.getSalary())));
		System.out.println(s);

//		4. Get the details of highest paid employee in the organization ?
		System.out.println("------------------------------------");
		Optional<Emp> l = EmpList.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println(l.get());

//		5. Get the names of all employees who have joined after 2015 ?
		System.out.println("------------------------------------");
		EmpList.stream().filter(e -> e.yearOfJoining > 2015).forEach(i -> System.out.println(i));

//		6. Count the number of employees in each department ?
		System.out.println("------------------------------------");
		Map<String, Long> e = EmpList.stream()
				.collect(Collectors.groupingBy(Emp::getDepartment, Collectors.counting()));
		System.out.println(e);

//		7. What is the average salary of each department ?
		System.out.println("------------------------------------");
		Map<String, Double> t = EmpList.stream()
				.collect(Collectors.groupingBy(Emp::getDepartment, Collectors.averagingDouble(q -> q.salary)));
		System.out.println(t);

//		8. Get the details of youngest male employee in the Development department ?
		System.out.println("------------------------------------");
		Optional<Emp> o = EmpList.stream()
				.filter(i -> i.getDepartment().equals("Development") && i.gender.equals("Male"))
				.collect(Collectors.minBy(Comparator.comparing(Emp::getAge)));
		System.out.println(o.get());

//		9. Who has the most working experience in the organization ?
		System.out.println("------------------------------------");
		Optional<Emp> v = EmpList.stream().collect(Collectors.minBy(Comparator.comparing(Emp::getYearOfJoining)));
		System.out.println(v.get());

//		10. How many male and female employees are there in the Sales team ?
		System.out.println("------------------------------------");
		Map<String, Long> p = EmpList.stream().filter(i -> i.department.equals("Sales"))
				.collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));
		System.out.println(p);

//		11.  What is the average salary of male and female employees ?
		System.out.println("------------------------------------");
		Map<String, Double> y = EmpList.stream()
				.collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingDouble(mz -> mz.getSalary())));
		System.out.println(y);

//		12. List down the names of all employees in each department ?
		System.out.println("------------------------------------");
		Map<String, List<String>> h = EmpList.stream().collect(
				Collectors.groupingBy(Emp::getDepartment, Collectors.mapping(Emp::getName, Collectors.toList())));
		System.out.println(h);
		
//		13.  What is the average salary and total salary of the whole organization ?
		System.out.println("------------------------------------");
		double db=EmpList.stream().mapToDouble(Emp::getSalary).sum();
		System.out.println(db);
		OptionalDouble avg=EmpList.stream().mapToDouble(Emp::getSalary).average();
		System.out.println(avg);
		
//		15.  Who is the oldest employee in the organization?
		System.out.println("------------------------------------");
		Optional<Emp> u=EmpList.stream().max(Comparator.comparing(Emp::getAge));
		System.out.println(u.get());
	}
}

class Emp {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Emp(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department
				+ ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// constructor
	// getters and setters
}