package com.k_4atomicInteger129;

public class MyThread extends Thread{
	private Service service;
	public MyThread(Service service){
		this.service=service;
	}
	@Override
	public void run() {
		service.addNum();
	}
}
