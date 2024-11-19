package com.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequeueDemo {
	public static void main(String[] args) {
		ArrayDeque<Integer> pq = new ArrayDeque<Integer>();
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		System.out.println(pq);
		pq.pollFirst();
		System.out.println(pq);
	}
}
