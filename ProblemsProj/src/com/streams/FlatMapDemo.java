package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("core java", "adv java", "springboot");
		List<String> uicourses = Arrays.asList("html", "css", "bs", "js");
		List<List<String>> ll=List.of(javacourses,uicourses);
//		ll.stream().forEach(System.out::print);
		Stream<String> s=ll.stream().flatMap(a->a.stream());
		s.forEach(a->System.out.println(a));
	}
}
