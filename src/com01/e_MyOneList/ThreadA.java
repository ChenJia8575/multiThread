package com01.e_MyOneList;

public class ThreadA extends Thread{
	private MyOneList list;
	public ThreadA(MyOneList list){
		this.list=list;
	}
	@Override
	public void run() {
		MyService serv = new MyService();
		serv.serviceAdd(list, "a");
	}
}
