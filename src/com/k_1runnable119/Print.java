package com.k_1runnable119;

public class Print implements Runnable{
	private boolean flag=true;

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		try {
			while(flag){
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
