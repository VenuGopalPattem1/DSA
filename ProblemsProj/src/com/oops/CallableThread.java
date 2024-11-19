package com.oops;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThread implements Callable {

	@Override
	public Object call() throws Exception {
		System.out.println("call ( ) - method executed...");
		return "success";
	}

	public static void main(String[] args) throws Exception {
		CallableThread d = new CallableThread();
		ExecutorService es = Executors.newFixedThreadPool(10);
		for (int i = 1; i <= 15; i++) {
			Future submit = es.submit(d);
			System.out.println(submit.get().toString() + " " + i);
		}
		es.shutdown();
	}

}
