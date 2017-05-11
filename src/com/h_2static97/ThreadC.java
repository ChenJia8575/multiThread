package com.h_2static97;

public class ThreadC extends Thread{
	private Service service;
	public ThreadC(Service service){
		this.service=service;
	}
	public void run() {
		service.prnitC();
	}
}
