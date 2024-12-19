package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedChar {
	static Character non(String s) {
		char[] c=s.toCharArray();
		Map<Character, Integer> m=new LinkedHashMap<Character, Integer>();
		for(char a:c) {
			m.put(a, m.getOrDefault(a, 0)+1);
		}
		
		for(Entry<Character, Integer> ma:m.entrySet())
		{
		if(ma.getValue()==1)
			return ma.getKey();
		}
		return '0';
		}
	public static void main(String[] args) {
		String s="my name is venu goapl";
		System.out.println(non(s));
//		non(s);
	}
}
