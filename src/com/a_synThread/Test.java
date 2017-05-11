package com.a_synThread;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Task task = new Task();
		ThreadA a = new ThreadA(task);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(task);
		b.setName("b");
		b.start();
		Thread.sleep(10000);		
		long begin = Math.min(CommonUtils.beginTime1, CommonUtils.beginTime2); 
		long end   = Math.max(CommonUtils.endTime1, CommonUtils.endTime2); 
		System.out.println("cost " + (end-begin)/1000);
		
	}

}
