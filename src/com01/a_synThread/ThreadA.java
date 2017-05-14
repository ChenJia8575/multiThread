package com01.a_synThread;

public class ThreadA extends Thread{
	private Task task;
	public ThreadA(Task task){
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
