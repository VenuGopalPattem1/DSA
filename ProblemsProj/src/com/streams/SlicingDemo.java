package com.streams;

import java.util.Arrays;
import java.util.List;

public class SlicingDemo {
	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("corejava", "corejava", "advjava", "advjava", "springboot", "restapi",
				"microservices");
		javacourses.stream().skip(2).forEach(i -> System.out.println(i));
		System.out.println("----------------------------------------");
		javacourses.stream().limit(3).forEach(i -> System.out.println(i));
		System.out.println("----------------------------------------");
		javacourses.stream().forEach(i -> System.out.println(i));
		System.out.println("----------------------------------------");
		javacourses.stream().distinct().forEach(i -> System.out.println(i));
	}
}
