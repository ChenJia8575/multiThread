package com02.f_2produceConsume160AllWaiting;

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
