package com03.e_1lockMethod219getHoldCount;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock = new ReentrantLock();
	public void method1(){
		try {
			lock.lock();
			System.out.println("method1 getholdcount="+
					lock.getHoldCount());
			method2();
		}finally{
			System.out.println("1 unlock");
			lock.unlock();
			System.out.println("1 unlock");
		}
	}
	private void method2() {
		try {
			lock.lock();
			System.out.println("method2 getholdcount="+
					lock.getHoldCount());
		}finally{
			System.out.println("2 unlock");
			lock.unlock();
			System.out.println("2 unlock");
		}
		
	}

}
