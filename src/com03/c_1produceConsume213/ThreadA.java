package com03.c_1produceConsume213;

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
