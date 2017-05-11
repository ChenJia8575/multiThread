package com.b_synNotExtends;

public class MyThreadA extends Thread{
	private Sub sub;
	public MyThreadA(Sub sub){
		this.sub=sub;
	}
	@Override
	public void run() {
		sub.serviceMethod();
	}
	
}
