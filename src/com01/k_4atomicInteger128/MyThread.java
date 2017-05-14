package com01.k_4atomicInteger128;

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
