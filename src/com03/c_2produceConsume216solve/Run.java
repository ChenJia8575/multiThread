package com03.c_2produceConsume216solve;

public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA[] as = new ThreadA[10];
		ThreadB[] bs = new ThreadB[10];
		for (int i = 0; i < 10; i++) {
			as[i] = new ThreadA(service);
			as[i].start();
			bs[i] = new ThreadB(service);
			bs[i].start();
		}
	}
}
