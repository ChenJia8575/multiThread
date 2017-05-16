package com02.b_4notify145;

public class NotifyThread2 extends Thread{
	private Object lock;
	public NotifyThread2(Object lock){
		this.lock=lock;
	}
	public void run(){
		new Service().synNotify(lock);;
	}
}
