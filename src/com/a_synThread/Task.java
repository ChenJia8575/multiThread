package com.a_synThread;

public class Task {
	private String data1;
	private String data2;
	
	public synchronized void doLongTask() throws InterruptedException{
		System.out.println("begin task");
		Thread.sleep(3000);
		data1="data 1 "+ Thread.currentThread().getName();
		data2="data 2 "+ Thread.currentThread().getName();
		System.out.println(data1);
		System.out.println(data2);
		System.out.println("end task");
	}
}
