package com03.c_2produceConsume216solve;

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
