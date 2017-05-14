package com01.c_synBlockThread;

public class ObjectService {
	public void serviceMethod() {
		try {
			System.out.println(Thread.currentThread().getName()+" is just in");
			synchronized(this){
				System.out.println(Thread.currentThread().getName()+" begin time=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" end   time=" + System.currentTimeMillis());
			}
			System.out.println(Thread.currentThread().getName()+" is just out");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
