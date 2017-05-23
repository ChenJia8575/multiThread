package com02.f_2produceConsume160AllWaiting;

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
