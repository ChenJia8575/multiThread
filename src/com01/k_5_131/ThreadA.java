package com01.k_5_131;

public class ThreadA extends Thread{
	private Service service;
	public ThreadA(Service service){
		this.service=service;
	}
	public void run(){
		service.method();
	}
}
