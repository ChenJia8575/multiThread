package com03.c_2produceConsume215deadwait;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private ReentrantLock lock=new ReentrantLock();
	private Condition condition = lock.newCondition(); 
	private boolean hasValue=false;
	public void set(){
		try {
			lock.lock();
			while(hasValue==true){
				System.out.println("may AA");
				condition.await();
			}
			System.out.println("A");
			hasValue=true;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void get(){
		try {
			lock.lock();
			while(hasValue==false){
				System.out.println("may aa");
				condition.await();
			}
			System.out.println("a");	
			hasValue=false;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
