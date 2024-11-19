package com.oops;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("RunnableThread.run()");
	}

	public static void main(String[] args) {
		RunnableThread d=new RunnableThread();
		Thread t= new Thread(d);
		t.start();
	}
}
