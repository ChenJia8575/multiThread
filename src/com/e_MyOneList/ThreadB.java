package com.e_MyOneList;

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
