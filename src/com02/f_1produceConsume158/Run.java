package com02.f_1produceConsume158;

public class Run {

	public static void main(String[] args) {
		String lock = new String("");
		Producer p = new Producer(lock);
		Consumer c = new Consumer(lock);
		ThreadP threadp = new ThreadP(p);
		ThreadC threadC = new ThreadC(c);
		threadp.start();
		threadC.start();
	}
}
