package com.h_2static97;

public class ThreadB extends Thread{
	private Service service;
	public ThreadB(Service service){
		this.service=service;
	}
	public void run() {
		service.prnitB();
	}
}
