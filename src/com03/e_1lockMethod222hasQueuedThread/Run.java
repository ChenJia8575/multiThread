package com03.e_1lockMethod222hasQueuedThread;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		Runnable runnable = new Runnable(){
			@Override
			public void run() {
				service.WaitMethod();
			}
		};
		Thread a = new Thread(runnable);
		a.start();
		Thread.sleep(500);
		Thread b = new Thread(runnable);
		b.start();
		Thread.sleep(500);
		System.out.println(service.lock.hasQueuedThread(a)+" "+a.getName()+
				" service.lock.hasQueuedThread(a)?");
		System.out.println(service.lock.hasQueuedThread(b)+" "+b.getName()+
				" service.lock.hasQueuedThread(b)?");
		System.out.println(service.lock.hasQueuedThreads()+
				" service.lock.hasQueuedThreads()?");
		
	}
}
