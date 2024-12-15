package com.array;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurance {
	static int occ(int[] a) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int b : a)
			m.put(b, m.getOrDefault(b, 0) + 1);
		int maxCount = 0;
		int mostFrequentElement = -1;
		for (int v : m.keySet()) {
			int val = m.get(v);
			if (val > maxCount) {
				maxCount = val;
				mostFrequentElement = v;
			}
		}
		return mostFrequentElement;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 3, 2, 1, 4, 1, 3, 3, 3 };
		System.out.println(occ(arr));
	}
}
