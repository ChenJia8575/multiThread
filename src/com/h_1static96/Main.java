package com.h_1static96;

public class Main {
//
	public static void main(String[] args) throws InterruptedException {
		ThreadA a = new ThreadA();
		a.setName("a");
		ThreadB b = new ThreadB();
		b.setName("b");
		a.start();
		b.start();
	}
}
