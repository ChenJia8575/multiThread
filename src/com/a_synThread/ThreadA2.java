package com.a_synThread;

public class ThreadA2 extends Thread{
	private Task2 task;
	public ThreadA2(Task2 task){
		this.task=task;
	}
	@Override
	public void run() {
		CommonUtils.beginTime1=System.currentTimeMillis();
		try {
			task.doLongTask();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonUtils.endTime1=System.currentTimeMillis();
	}
}
