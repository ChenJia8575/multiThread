package com01.g_1sameSynObj91;

public class ThreadB extends Thread{
	private Service service;
	private MyObject obj;
	public ThreadB(Service service,MyObject obj){
		this.service=service;
		this.obj=obj;
	}
	public void run() {
		service.method(obj);
	}
}
