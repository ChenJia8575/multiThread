package com01.k_5_130;

public class ThreadB extends Thread{
	private Service service;
	public ThreadB(Service service){
		this.service=service;
	}
	public void run(){
		service.stop();
	}
}
