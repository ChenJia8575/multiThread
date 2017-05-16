package com02.b_3wait143;

public class MyThread1 extends Thread{
	private Object lock;
	public MyThread1(Object lock){
		this.lock=lock;
	}
	public void run(){
		new Service().method(lock);
	}
}
