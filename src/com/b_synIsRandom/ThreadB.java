package com.b_synIsRandom;

public class ThreadB extends Thread{
	private MyList list;
	public ThreadB(MyList list){
		this.list=list;
	}
	
	public void run(){
		for(int i=1;i<=1000;i++){
			list.add("threadB "+i);
		}
		
	}
}
