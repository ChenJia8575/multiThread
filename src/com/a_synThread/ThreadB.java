package com.a_synThread;

public class ThreadB extends Thread{
	private Task task;
	public ThreadB(Task task){
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
