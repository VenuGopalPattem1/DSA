package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Practice {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(66, 43, 5, 8, 5, 445, 6, 88, 8, 9, 2, 3, 445, 6, 67, 88);
//		List<String> li=List.of("venu", "vinod", "vamsi", "vinay", "karthik");
//		numbers.stream().filter(a->a%2==0).forEach(a->System.out.print(a+" "));
//		int a=numbers.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(a);
//		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//		names.stream().map(a->a.toLowerCase()).forEach(a->System.out.println(a));
//		System.out.println(numbers.stream().distinct().count());
//		List<List<Integer>> ll=Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
//		ll.stream().flatMap(a->a.stream()).forEach(a->System.out.println(a));
		OptionalDouble n=numbers.stream().mapToInt(Integer::intValue).average();
		System.out.println(n.getAsDouble());
	} 
}
