package com02.b_4notify145;

public class WaitThread extends Thread{
	private Object lock;
	public WaitThread(Object lock){
		this.lock=lock;
	}
	public void run(){
		new Service().method(lock);
	}
}
