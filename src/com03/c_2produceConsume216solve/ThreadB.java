package com03.c_2produceConsume216solve;

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
