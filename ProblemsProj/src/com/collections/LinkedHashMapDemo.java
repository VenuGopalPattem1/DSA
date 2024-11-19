package com.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "one");
		map.put(3, "three");
		map.put(5, "five");
		map.put(4, "four");
		map.put(7, "eaight");
		System.out.println(map);
		System.out.println("-------------------------------------------");
		Set<Integer> keys = map.keySet();
		for (int i : keys)
			System.out.println(i + " - " + map.get(i));
		System.out.println();
		System.out.println("-------------------------------------------");
		Collection<String> val = map.values();
		for (String v : val)
			System.out.print(v + " ");

		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> en = it.next();
			System.out.println(en.getKey() + " - " + en.getValue());
		}
		System.out.println("-------------------------------------------");
		for (Entry<Integer, String> ent : set) {
			System.out.println(ent.getKey());
			System.out.println(ent.getValue());

		}
	}
}
