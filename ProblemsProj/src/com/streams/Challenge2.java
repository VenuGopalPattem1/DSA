package com.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Challenge2 {
	public static void main(String[] args) {
//		1. Filter Even Numbers 
		List<Integer> numbers = Arrays.asList(66, 43, 5, 8, 5, 445, 6, 88, 8, 9, 2, 3, 445, 6, 67, 88);
		numbers.stream().filter(a -> a % 2 == 0).forEach(a -> System.out.print(a + " "));
		System.out.println();

//		2. Find Maximum 
		System.out.println("-------------------------------------");
		Optional<Integer> max = numbers.stream().max(Integer::compare);
		System.out.println(max.get());

//		3. Sum of Elements 
		System.out.println("-------------------------------------");
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

//		4.List of names to Uppercase
		System.out.println("-------------------------------------");
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.stream().map(a -> a.toUpperCase()).forEach(a -> System.out.println(a));

//		5. Sort List 
		System.out.println("-------------------------------------");
		numbers.stream().sorted().forEach(a -> System.out.print(a + "    "));
		System.out.println();

//		6.Count elements
		System.out.println("-------------------------------------");
		System.out.println(numbers.stream().count());

//		7. Get Distinct Elements 
		System.out.println("-----------------------------------------");
		numbers.stream().distinct().forEach(a -> System.out.print(a + " "));
		System.out.println();

//		8. Reduce to Sum 
		int s = numbers.stream().reduce(0, Integer::sum);
		System.out.println("-----------------------------------------");
		System.out.println(s);

//		9. Find Any 
		System.out.println("-----------------------------------------");
		Optional<Integer> a = numbers.stream().findAny();
		System.out.println(a.get());

//		10.List First Names
		System.out.println("-----------------------------------------");
		List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris", "Charlie Lou");
		fullNames.stream().map(q->q.split(" ")[0]).forEach(q->System.out.println(q));
		
//		11. All Match 
		boolean m=numbers.stream().allMatch( n->n>0);
		System.out.println("-----------------------------------------");
		System.out.println(m);
		
//		12. None Match 
		boolean q=numbers.stream().noneMatch( n->n<0);
		System.out.println("-----------------------------------------");
		System.out.println(q);
		
//		13. Find First 
		System.out.println("-----------------------------------------");
		Optional<Integer> fir = numbers.stream().findFirst();
		System.out.println(fir.get());
		
		//FlatMap 
		System.out.println("-----------------------------------------");
		List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2), 
				Arrays.asList(3, 4, 5)); 
		nestedNumbers.stream().flatMap(c->c.stream()).forEach(c->System.out.println(c));
		
//		16. Peek Elements 
		System.out.println("-----------------------------------------");
		numbers.stream().peek(c->System.out.print(c+"  ")).collect(Collectors.toList());
		System.out.println();
		
//		17. Limit Stream 
		System.out.println("-----------------------------------------");
		numbers.stream().limit(5).forEach(c->System.out.print(c+"  "));
		System.out.println();
		
		
//		18. Skip Stream 
		System.out.println("-----------------------------------------");
		numbers.stream().skip(5).forEach(c->System.out.print(c+"  "));
		System.out.println();
		
		
//		19. Convert to Set 
		System.out.println("-----------------------------------------");
		Set<Integer> set=numbers.stream().collect(Collectors.toSet());
		set.forEach(c->System.out.print(c+" "));
		System.out.println();
		
		
//		20. Summarizing Statistics
		System.out.println("-----------------------------------------");
		IntSummaryStatistics n=numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
		System.out.println(n);
		
		Double dd=numbers.stream().collect(Collectors.averagingDouble(c->c));
		System.out.println(dd);
		StringJoiner myString=new StringJoiner("_");
        myString.add("ashok");
        myString.add("it");
        myString.add("java");
        System.out.println(myString);
	}
}
