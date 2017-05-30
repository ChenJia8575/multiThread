package com03.c_2produceConsume215deadwait;

public class ThreadA extends Thread{
	private MyService service;
	
	public ThreadA(MyService service){
		this.service=service;
	}
	
	public void run(){
		while(true){
			service.set();
		}
	}
	

}
