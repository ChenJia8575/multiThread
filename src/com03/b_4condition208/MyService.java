package com03.b_4condition208;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void awaitA(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+
					" begin awaitA 时间为 "+System.currentTimeMillis());
			condition.await();
			System.out.println(Thread.currentThread().getName()+
					" end   awaitA 时间为 "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
			System.out.println("A锁释放了");
		}
	}
	public void awaitB(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+
					" begin awaitB 时间为 "+System.currentTimeMillis());
			condition.await();
			System.out.println(Thread.currentThread().getName()+
					" end   awaitB 时间为 "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
			System.out.println("B锁释放了");
		}
	}
	public void signalAll(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+
					" signalAll 时间为 " + System.currentTimeMillis());
			condition.signalAll();
		} finally {
			lock.unlock();
			System.out.println("signalAll锁释放了");
		}
	}
}
