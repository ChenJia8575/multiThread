package com03.c_1produceConsume213;

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
