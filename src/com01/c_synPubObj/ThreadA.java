package com01.c_synPubObj;

public class ThreadA extends Thread{
	private Service service;
	public ThreadA(Service service){
		this.service=service;
	}
	
	public void run(){
		service.set("a", "aa");
	}
}
