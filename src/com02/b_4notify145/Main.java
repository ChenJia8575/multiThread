package com02.b_4notify145;

public class Main {

	public static void main(String[] args) {
		Object lock = new Object();
		WaitThread w = new WaitThread(lock);
		NotifyThread n1 = new NotifyThread(lock);
		NotifyThread2 n2 = new NotifyThread2(lock);
		w.start();
		n1.start();
		n2.start();
	}

}
