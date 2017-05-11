package com.g_1diffSynObj93;

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
