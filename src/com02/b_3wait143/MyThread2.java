package com02.b_3wait143;

public class MyThread2 extends Thread{
	private Object lock;
	public MyThread2(Object lock){
		this.lock=lock;
	}
	public void run(){
		new Service().method(lock);
	}
}
