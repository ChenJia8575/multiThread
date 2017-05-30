package com03.e_1lockMethod221getWaitQueueLength;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock = new ReentrantLock();
	private Condition cond=lock.newCondition();
	public void waitMethod(){
		try {
			lock.lock();
			cond.await();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
			System.out.println(Thread.currentThread().getName()+" over");
		}
	}
	public void notifyMethod(){
		try {
			lock.lock();
			System.out.println(lock.getWaitQueueLength(cond)+" threads are waiting for cond.");
			cond.signal();
			System.out.println(lock.getWaitQueueLength(cond)+" threads are waiting for cond.");
		}finally{
			lock.unlock();
			System.out.println(Thread.currentThread().getName()+" over");
		}
	}
}
