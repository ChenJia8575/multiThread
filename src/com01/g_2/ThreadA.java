package com01.g_2;

public class ThreadA extends Thread{
	private Service service;
	private MyObject obj;
	public ThreadA(Service service,MyObject obj){
		this.service=service;
		this.obj=obj;
	}
	public void run() {
		service.method(obj);
	}
}
