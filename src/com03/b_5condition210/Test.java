package com03.b_5condition210;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		Thread.sleep(3000);
		service.signalAll_A();
	}
}
