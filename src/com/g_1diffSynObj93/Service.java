package com.g_1diffSynObj93;

public class Service {
	public void method(MyObject obj){
		synchronized(obj){
			try{
				System.out.println("thread "+ Thread.currentThread().getName()
						+" get lock,time "+System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("thread "+ Thread.currentThread().getName()
						+" release lock,time "+System.currentTimeMillis());
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
