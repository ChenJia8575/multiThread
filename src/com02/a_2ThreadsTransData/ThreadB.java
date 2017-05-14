package com02.a_2ThreadsTransData;

public class ThreadB extends Thread {
	private MyList list;

	public ThreadB(MyList list) {
		this.list = list;
	}
	public void run() {
		try {
			while(true){
				//同步线程间的变量更新
				synchronized("444"){
					if(list.size()==5){
						System.out.println("==5 , b is about to exit");
						throw new InterruptedException();
					}
				}
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
