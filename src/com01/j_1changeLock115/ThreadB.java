package com01.j_1changeLock115;

public class ThreadB extends Thread{
	private Service service;
	public ThreadB(Service service){
		this.service=service;
	}
	public void run() {
		service.method();
	}
}
