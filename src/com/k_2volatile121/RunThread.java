package com.k_2volatile121;

public class RunThread extends Thread{

	//private boolean isRunning=true;
	volatile private boolean isRunning=true;
	//强制从公共内存中读取变量的值。
	public boolean isRunning() {
		return isRunning;
	}
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	@Override
	public void run() {
		System.out.println("进入run了");
		while(isRunning){
			
		}
		System.out.println("stoped");
	}
}
