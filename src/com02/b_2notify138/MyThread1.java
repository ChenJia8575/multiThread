package com02.b_2notify138;

public class MyThread1 extends Thread{
	private Object lock;
	public MyThread1(Object lock){
		this.lock=lock;
	}
	public void run(){
		try {
			synchronized(lock){
				System.out.println("start wait time " + System.currentTimeMillis());
				lock.wait();
				System.out.println("end   wait time " + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
