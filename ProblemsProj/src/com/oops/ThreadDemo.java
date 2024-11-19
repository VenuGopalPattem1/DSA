package com.oops;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		System.out.println("ThreadDemo.run()");
	}
	public static void main(String[] args) {
		ThreadDemo d=new ThreadDemo();
		Thread t= new Thread(d);
		t.start();
	}
}
