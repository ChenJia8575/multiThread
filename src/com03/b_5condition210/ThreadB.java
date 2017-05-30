package com03.b_5condition210;

public class ThreadB extends Thread{
	private MyService service;
	public ThreadB(MyService service){
		this.service=service;
	}
	public void run(){
		service.awaitB();
	}
}
