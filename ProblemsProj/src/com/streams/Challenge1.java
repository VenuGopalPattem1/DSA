package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Challenge1 {
	public static void main(String[] args) {

//		1: Write a Java 8 program to filter even numbers from a list ?
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

//		2: Write a Java 8 program to calculate the sum of integers in a list ?
		System.out.println("------------------------------------");
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

//		3. Write a Java 8 program to find the maximum element from a list ?
		System.out.println("------------------------------------");
		Optional<Integer> max = numbers.stream().max(Integer::compareTo);
		System.out.println(max.get());

//		4. Write a Java 8 program to find the minimum element from a list ?
		System.out.println("------------------------------------");
		Optional<Integer> min = numbers.stream().min(Integer::compareTo);
		System.out.println(min.get());

//		3: Write a Java 8 program to calculate the average of integers in a list ?
		System.out.println("------------------------------------");
		OptionalDouble avg = numbers.stream().mapToDouble(Integer::intValue).average();
		System.out.println(avg.getAsDouble());

//		4. Write a Java 8 program to check if a list contains a specific element ?
		System.out.println("------------------------------------");
		boolean b = numbers.stream().anyMatch(i -> i == 1);
		System.out.println(b);

//		5. Write a Java 8 program to find the sum of all even numbers in a list of integers ?
		System.out.println("------------------------------------");
		List<Integer> val = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int esum = val.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println(esum);

//		6. Write a Java 8 program to concatenate all strings in a list ?
		System.out.println("------------------------------------");
		List<String> strings = List.of("Hello", " ", "World", "!");
		String s = strings.stream().collect(Collectors.joining());
		System.out.println(s);

//7. Write a Java 8 program to find the average length of strings in a list of strings?
		System.out.println("------------------------------------");
		List<String> s1 = List.of("apple", "banana", "orange", "grape", "kiwi");
		/*
		 * OptionalDouble av=s1.stream().mapToInt(a->a.length()).average();
		 * System.out.println(av.getAsDouble());
		 */
		OptionalDouble av = s1.stream().mapToInt(a -> a.length()).average();
		System.out.println(av.getAsDouble());

//		8. Write a Java 8 program to count the occurrences of a given character in a list of strings?
		System.out.println("------------------------------------");
		List<String> m = List.of("apple", "banana", "chaerry");
		char targetChar = 'a';
		long count = m.stream().flatMapToInt(CharSequence::chars).filter(a -> a == targetChar).count();
		System.out.println(count);

//		 41. Write a Java 8 program print all the strings of given length ?
		List<String> list = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
		System.out.println("------------------------------------");
		int targetLength = 6;
		list.stream().filter(a -> a.length() == targetLength).forEach(a -> System.out.println(a));

//45.Write a Java 8 program to find the first word in a list that starts with given letter ?
		System.out.println("------------------------------------");
		List<String> words = List.of("apple", "banana", "orange", "grape");
		char targetLetter = 'g';
		words.stream().filter(a -> a.charAt(0) == targetLetter).forEach(a -> System.out.println(a));

//		44. Write a Java 8 program to check if all elements in a list are unique ?
		System.out.println("------------------------------------");
		List<Integer> u = List.of(1, 2, 3, 3, 4, 5);
		boolean q = u.stream().collect(Collectors.toSet()).size() == u.size();
		System.out.println(q);

//		40. Write a Java 8 program to check if a list contains a specific string ?
		System.out.println("------------------------------------");
		List<String> items = Arrays.asList("apple", "banana", "orange", "grape");
		String searchString = "banana";
		items.stream().filter(a->a.equals(searchString)).forEach(a->System.out.println(a));
	}
}
