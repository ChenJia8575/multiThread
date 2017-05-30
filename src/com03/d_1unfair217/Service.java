package com03.d_1unfair217;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock;
	public Service(boolean isFair){
		lock=new ReentrantLock(isFair);
	}
	public void method(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+" get lock.");
		} finally{
			lock.unlock();
		}
	}
}
