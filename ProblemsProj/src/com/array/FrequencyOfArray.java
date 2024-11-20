package com.array;

import java.util.HashMap;
import java.util.Set;

public class FrequencyOfArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 4, 5, 6, 6, 3, 4, 2, 4, 1, 6, 7, 5, 8 };
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for (Integer i : a) {
			h.put(i, h.getOrDefault(i, 0)+1);
		}

		Set<Integer> m= h.keySet();
		for(Integer i:m)
			System.out.println(i+" ---> "+h.get(i));
	}
}
