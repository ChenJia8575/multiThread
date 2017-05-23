package com02.f_3produceConsume164AllWaiting;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		Producer p = new Producer(lock);
		Consumer c = new Consumer(lock);
		ThreadP[] threadp = new ThreadP[2];
		ThreadC[] threadC = new ThreadC[2];
		for(int i = 0 ;i<2;i++){
			threadp[i]= new ThreadP(p);
			threadp[i].setName("producer "+(i+1));
			threadC[i]= new ThreadC(c);
			threadC[i].setName("cunsumer "+(i+1));
			threadp[i].start();
			threadC[i].start();
		}
		Thread.sleep(5000);
		
		int activeNum = Thread.currentThread().getThreadGroup().activeCount();
		Thread[] threadArray = new Thread[activeNum];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for(int i = 0;i<threadArray.length;i++){
			System.out.println(threadArray[i].getName()+
					" " +threadArray[i].getState());
		}
	}
}
