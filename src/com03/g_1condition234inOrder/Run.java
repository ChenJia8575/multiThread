package com03.g_1condition234inOrder;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run {
	volatile private static int nextPrintWho = 1;
	private static ReentrantLock lock = new ReentrantLock();
	final private static Condition condA = lock.newCondition();
	final private static Condition condB = lock.newCondition();
	final private static Condition condC = lock.newCondition();

	public static void main(String[] args) {
		Thread a = new Thread() {
			@Override
			public void run() {
				try {
					lock.lock();
					while (nextPrintWho != 1) {
						condA.await();
					}
					for (int i = 1; i <= 3; i++) {
						System.out.println("ThreadA " + i);
					}
					nextPrintWho = 2;
					condB.signal();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		Thread b = new Thread() {
			@Override
			public void run() {
				try {
					lock.lock();
					while (nextPrintWho != 2) {
						condB.await();
					}
					for (int i = 1; i <= 3; i++) {
						System.out.println("ThreadB " + i);
					}
					nextPrintWho = 3;
					condC.signal();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		Thread c = new Thread() {
			@Override
			public void run() {
				try {
					lock.lock();
					while (nextPrintWho != 3) {
						condC.await();
					}
					for (int i = 1; i <= 3; i++) {
						System.out.println("ThreadC " + i);
					}
					nextPrintWho = 1;
					condA.signal();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};
		
		//Thread[] arra = new Thread[5];
		//Thread[] arrb = new Thread[5];
		//Thread[] arrc = new Thread[5];
		for(int i = 0;i<5;i++){
			//arra[i]=new Thread(a);
			//arrb[i]=new Thread(b);
			//arrc[i]=new Thread(c);
			new Thread(a).start();
			new Thread(b).start();
			new Thread(c).start();
		}
	}
}