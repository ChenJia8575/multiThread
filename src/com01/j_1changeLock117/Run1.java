package com01.j_1changeLock117;

public class Run1 {
//
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		Userinfo user = new Userinfo();
		ThreadA a = new ThreadA(service,user);
		a.setName("A");
		ThreadB b = new ThreadB(service,user);
		b.setName("B");
		a.start();
		Thread.sleep(50);
		b.start();

	}
}
