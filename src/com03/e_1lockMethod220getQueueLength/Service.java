package com03.e_1lockMethod220getQueueLength;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	public ReentrantLock lock = new ReentrantLock();
	public void method(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+
					" now in the method.");
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
			System.out.println(Thread.currentThread().getName()+" over");
		}
	}
}
