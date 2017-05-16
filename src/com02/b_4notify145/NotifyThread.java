package com02.b_4notify145;

public class NotifyThread extends Thread{
	private Object lock;
	public NotifyThread(Object lock){
		this.lock=lock;
	}
	public void run(){
		new Service().synNotify(lock);;
	}
}
