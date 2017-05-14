package com01.a_synThread;

public class Task2 {
	private String data1;
	private String data2;
	
	public void doLongTask() throws InterruptedException{
		System.out.println("begin task "+Thread.currentThread().getName());
		Thread.sleep(3000);
		String private1= "data 1 "+ Thread.currentThread().getName();
		String private2= "data 2 "+ Thread.currentThread().getName();
		synchronized (this){
			data1=private1;
			data2=private2;
		}
		System.out.println(data1);
		System.out.println(data2);
		System.out.println("end task "+Thread.currentThread().getName());
	}
}
