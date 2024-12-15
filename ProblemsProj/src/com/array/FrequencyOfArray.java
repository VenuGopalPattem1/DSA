package com.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 4, 5, 6, 6, 3, 4, 2, 4, 1, 6, 7, 5, 8 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : a)
			map.put(i, map.getOrDefault(i, 0) + 1);
		for (int q : map.keySet())
			System.out.println(q + "-----------> " + map.get(q));
	}
}
