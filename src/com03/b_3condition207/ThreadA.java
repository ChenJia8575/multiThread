package com03.b_3condition207;

public class ThreadA extends Thread{
	private MyService service;
	public ThreadA(MyService service){
		this.service=service;
	}
	public void run(){
		service.await();
	}
}
