package com01.d_AsynHalfSynThread;

public class ThreadB extends Thread{
	private Task task;
	public ThreadB(Task task){
		this.task=task;
	}
	@Override
	public void run() {
		task.doLongTask();
	}
}
