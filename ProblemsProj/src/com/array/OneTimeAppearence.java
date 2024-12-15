package com.array;

import java.util.HashMap;
import java.util.Map;

public class OneTimeAppearence {
	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 3, 2 };

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i : a)
			m.put(i, m.getOrDefault(i, 0) + 1);

		for(Integer q:m.keySet())
		{
			if(m.get(q)==2)
				System.out.println(q);
		}
	}
}
