package com03.c_2produceConsume215deadwait;

public class ThreadB extends Thread{
	private MyService service;
	
	public ThreadB(MyService service){
		this.service=service;
	}
	
	public void run(){
		while(true){
			service.get();
		}
	}
	

}
