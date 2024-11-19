package com.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueeDemo {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		System.out.println(pq);
		System.out.println(pq.remove());
	}
}
