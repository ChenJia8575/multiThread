package com01.b_synIsRandom;

public class ThreadA extends Thread{
	private MyList list;
	public ThreadA(MyList list){
		this.list=list;
	}
	
	public void run(){
		for(int i=1;i<=1000;i++){
			list.add("threadA "+i);
		}
		
	}
}
