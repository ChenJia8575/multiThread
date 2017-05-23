package com02.f_3produceConsume164AllWaiting;

public class ThreadC extends Thread{
	private Consumer c;
	
	public ThreadC(Consumer c){
		this.c=c;
	}
	public void run(){
		while(true){
			c.getValue();
		}
	}
	
	
	

}
