package com03.b_5condition210;

public class ThreadA extends Thread{
	private MyService service;
	public ThreadA(MyService service){
		this.service=service;
	}
	public void run(){
		service.awaitA();
	}
}
