package com01.j_1changeLock115;

public class Run2 {
//
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		a.start();
		b.start();

	}
}
