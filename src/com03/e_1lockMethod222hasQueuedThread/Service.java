package com03.e_1lockMethod222hasQueuedThread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	public ReentrantLock lock = new ReentrantLock();
	public Condition cond = lock.newCondition();
	public void WaitMethod(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+
					" now in the method.");
			Thread.sleep(30000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
			System.out.println(Thread.currentThread().getName()+" over");
		}
	}
}
