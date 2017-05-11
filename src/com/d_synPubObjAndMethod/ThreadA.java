package com.d_synPubObjAndMethod;

public class ThreadA extends Thread{
	private Service service;
	public ThreadA(Service service){
		this.service=service;
	}
	
	public void run(){
		service.synObj();
	}
}
