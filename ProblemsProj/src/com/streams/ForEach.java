package com.streams;

import java.util.ArrayList;

public class ForEach {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		al.stream().filter((i)->i<=3).forEach(System.out::print);
	}
}
