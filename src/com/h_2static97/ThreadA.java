package com.h_2static97;

public class ThreadA extends Thread{
	private Service service;
	public ThreadA(Service service){
		this.service=service;
	}
	public void run() {
		service.prnitA();
	}
}
