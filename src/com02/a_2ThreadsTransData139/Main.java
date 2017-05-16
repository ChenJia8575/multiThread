package com02.a_2ThreadsTransData139;

public class Main {

	public static void main(String[] args) {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.setName("a");
		a.start();
		
		ThreadB b = new ThreadB(lock);
		b.setName("b");
		b.start();
		
	}

}
