package com02.g_1produceConsume165stack;

public class ThreadC extends Thread{
	private Consumer c;
	
	public ThreadC(Consumer c){
		this.c=c;
	}
	public void run(){
		while(true){
			c.pop();
		}
	}
	
	
	

}
