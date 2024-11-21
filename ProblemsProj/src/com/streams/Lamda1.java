package com.streams;

public class Lamda1 {
	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=1;i<=5;i++)
				System.out.println(Thread.currentThread()+"       "+i);
		};
		Thread t=new Thread(r);
		t.run();
	}
}
