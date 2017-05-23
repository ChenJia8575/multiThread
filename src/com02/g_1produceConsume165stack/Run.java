package com02.g_1produceConsume165stack;

public class Run {
	public static void main(String[] args) {
		MyStack mystack = new MyStack();
		Producer p= new Producer(mystack);
		Consumer c= new Consumer(mystack);
		ThreadP tp = new ThreadP(p);
		ThreadC tc = new ThreadC(c);
		tp.start();
		tc.start();
		
	}
}
