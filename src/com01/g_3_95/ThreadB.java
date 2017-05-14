package com01.g_3_95;

public class ThreadB extends Thread{

	private MyObject obj;
	public ThreadB(MyObject obj){
		this.obj=obj;
	}
	public void run() {
		obj.print();
	}
}
