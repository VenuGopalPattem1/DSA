package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
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
		Set<Integer> keys=map.keySet();
		for(Integer i:keys)
			System.out.print(i+" - "+map.get(i)+" ");
		System.out.println();
		System.out.println("-------------------------------------------");
		Collection<String> val=map.values();
		for(String v:val)
			System.out.print(v+" ");
		System.out.println();
		System.out.println("-------------------------------------------");
		Set<Entry<Integer, String>> ab=map.entrySet();
		  Iterator<Entry<Integer, String>> it=ab.iterator();
		  while(it.hasNext()) {
			  Entry<Integer, String> entry=it.next();
			  System.out.println(entry.getKey()+" - "+entry.getValue());
		  }
	}
}
