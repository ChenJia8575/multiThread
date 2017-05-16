package com02.b_3wait143;

public class Main {

	public static void main(String[] args) {
		//a执行到wait后，跳出synchronized，b进来
		Object lock = new Object();
		MyThread1 t1 = new MyThread1(lock);
		t1.start();
		MyThread2 t2 = new MyThread2(lock);
		t2.start();
	}
}
