package com01.d_AsynHalfSynThread;

public class ThreadA extends Thread{
	private Task task;
	public ThreadA(Task task){
		this.task=task;
	}
	@Override
	public void run() {
		task.doLongTask();
	}
}
