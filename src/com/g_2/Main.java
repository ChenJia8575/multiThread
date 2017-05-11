package com.g_2;

public class Main {
//
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyObject obj = new MyObject();
		ThreadA a = new ThreadA(service,obj);
		a.setName("a");
		ThreadB b = new ThreadB(obj);
		b.setName("b");
		a.start();
		Thread.sleep(100);
		b.start();
	}
}
