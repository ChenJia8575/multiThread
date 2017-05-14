package com01.h_4synBlockObjsOneLock101;

public class ThreadA extends Thread{
	private Service service;
	public ThreadA(Service service){
		this.service=service;
	}
	public void run() {
		service.prnitA();
	}
}
