package com01.h_4synBlockObjsOneLock101;

public class ThreadB extends Thread{
	private Service service;
	public ThreadB(Service service){
		this.service=service;
	}
	public void run() {
		service.prnitB();
	}
}
