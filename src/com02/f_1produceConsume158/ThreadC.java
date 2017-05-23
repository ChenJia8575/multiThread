package com02.f_1produceConsume158;

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
