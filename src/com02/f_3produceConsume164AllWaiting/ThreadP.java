package com02.f_3produceConsume164AllWaiting;

public class ThreadP extends Thread{
	private Producer p;
	
	public ThreadP(Producer p){
		this.p=p;
	}
	public void run(){
		while(true){
			p.setValue();
		}
	}
	
	
	

}
