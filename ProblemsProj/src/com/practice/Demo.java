package com.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(3, "three");
		map.put(7, "seven");
		map.put(7, "eaight");
		map.put(5, "five");
		map.put(4, "four");
		map.put(7, "seven");
		map.put(7, "eaight");
		System.out.println(map);
		System.out.println("-------------------------------------------");
		Collection<Integer> s=map.keySet();
		for(Integer i:s)
			System.out.println(i+" "+map.get(i));
	}
}