package com01.c_synPubObj;

public class ThreadB extends Thread{
	private Service service;
	public ThreadB(Service service){
		this.service=service;
	}
	
	public void run(){
		service.set("b", "bb");
	}
}
