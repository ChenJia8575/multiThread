package com01.h_3synObjsStaticOneLock99;

public class ThreadA extends Thread{
	private Service service;
	public ThreadA(Service service){
		this.service=service;
	}
	public void run() {
		service.prnitA();
	}
}
