package com02.e_1waitOld155;

public class ThreadSubtract extends Thread{
	private Subtract p;
	
	public ThreadSubtract(Subtract p){
		this.p=p;
	}
	
	public void run(){
		p.subtract();
	}
}
