package com03.e_1lockMethod220getQueueLength;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		Runnable runnable = new Runnable(){
			@Override
			public void run() {
				service.method();
			}
		};
		Thread[] threadArray = new Thread[10];
		for(int i=0;i<10;i++){
			threadArray[i]=new Thread(runnable);
			threadArray[i].start();
		}
		Thread.sleep(2000);
		System.out.println(service.lock.getQueueLength()+
				" threads are waiting for geting the lock.");
	}
}
