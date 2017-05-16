package com02.b_4notify145;

public class Service {
	public void method(Object lock){
		try {
			synchronized(lock){
				System.out.println("begin wait threadname "
						+Thread.currentThread().getName());
				lock.wait();
				System.out.println("end wait threadname "
						+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void synNotify(Object lock){
		try {
			synchronized(lock){
				System.out.println("begin notify Threadname "+
						Thread.currentThread().getName() +
						"time "+ System.currentTimeMillis());
				lock.notify();
				Thread.sleep(5000);
				System.out.println("end   notify Threadname "+
						Thread.currentThread().getName()+
						"time "+ System.currentTimeMillis());
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
