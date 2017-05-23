package com02.e_1waitOld155;

public class ThreadAdd extends Thread{
	private Add p;
	
	public ThreadAdd(Add p){
		this.p=p;
	}
	
	public void run(){
		p.add();
	}
}
