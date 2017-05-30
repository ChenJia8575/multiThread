package com03.c_1produceConsume213;

public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
		ThreadB b = new ThreadB(service);
		b.start();
	}

}
