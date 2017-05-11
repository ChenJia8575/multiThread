package com.a_synThread;

public class ThreadB2 extends Thread{
	private Task2 task;
	public ThreadB2(Task2 task){
		this.task=task;
	}
	@Override
	public void run() {
		CommonUtils.beginTime2=System.currentTimeMillis();
		try {
			task.doLongTask();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonUtils.endTime2=System.currentTimeMillis();
	}
}
