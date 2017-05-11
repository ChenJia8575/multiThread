package com.j_1changeLock117;

public class ThreadA extends Thread{
	private Service service;
	private Userinfo user;
	public ThreadA(Service service,Userinfo user){
		this.service=service;
		this.user=user;
	}
	public void run() {
		service.method(user);
	}
}
