package com.streams;

import java.util.Arrays;
import java.util.List;

public class MapClass {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("india", "usa", "uk", "japan");
		names.stream().filter(i->i.length()>=3).map(i->i.length()+" "+i).forEach(i->System.out.println(i));
	}
}
