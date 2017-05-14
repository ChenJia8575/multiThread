package com01.b_synNotExtends;

public class MyThreadB extends Thread{
	private Sub sub;
	public MyThreadB(Sub sub){
		this.sub=sub;
	}
	@Override
	public void run() {
		sub.serviceMethod();
	}
	
}
