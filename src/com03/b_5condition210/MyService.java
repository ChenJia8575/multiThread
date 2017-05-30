package com03.b_5condition210;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();
	public void awaitA(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+
					" begin awaitA 时间为 "+System.currentTimeMillis());
			conditionA.await();
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
			conditionB.await();
			System.out.println(Thread.currentThread().getName()+
					" end   awaitB 时间为 "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
			System.out.println("B锁释放了");
		}
	}
	public void signalAll_A(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+
					" signalAll_A 时间为 " + System.currentTimeMillis());
			conditionA.signalAll();
		} finally {
			lock.unlock();
			System.out.println("signalAll锁释放了");
		}
	}
	public void signalAll_B(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+
					" signalAll_B 时间为 " + System.currentTimeMillis());
			conditionB.signalAll();
		} finally {
			lock.unlock();
			System.out.println("signalAll锁释放了");
		}
	}
}
