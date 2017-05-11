package com.h_3synObjsStaticOneLock99;

public class Main {
//
	public static void main(String[] args) throws InterruptedException {
		Service service1 = new Service();
		Service service2 = new Service();
		ThreadA a = new ThreadA(service1);
		a.setName("A");
		ThreadB b = new ThreadB(service2);
		b.setName("B");
		a.start();
		b.start();

	}
}
