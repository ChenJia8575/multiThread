package com.a_synThread;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		Task2 task = new Task2();
		ThreadA2 a = new ThreadA2(task);
		a.setName("a");
		a.start();
		ThreadB2 b = new ThreadB2(task);
		b.setName("b");
		b.start();
		Thread.sleep(10000);		
		long begin = Math.min(CommonUtils.beginTime1, CommonUtils.beginTime2); 
		long end   = Math.max(CommonUtils.endTime1, CommonUtils.endTime2); 
		System.out.println("cost " + (end-begin)/1000);
		
	}

}
