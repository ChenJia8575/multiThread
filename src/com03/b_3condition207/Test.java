package com03.b_3condition207;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
		Thread.sleep(3000);
		service.signal();
	}
}
