package com01.f_MyOneList2;

public class ThreadB extends Thread{
	private MyOneList list;
	public ThreadB(MyOneList list){
		this.list=list;
	}
	@Override
	public void run() {
		MyService serv = new MyService();
		serv.serviceAdd(list, "B");
	}
}
