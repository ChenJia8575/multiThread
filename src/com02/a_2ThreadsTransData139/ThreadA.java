package com02.a_2ThreadsTransData139;

public class ThreadA extends Thread {
	private Object lock;

	public ThreadA(Object lock) {
		this.lock = lock;
	}

	public void run() {
		try {
			// 同步线程间的变量更新
			synchronized (lock) {
				if (MyList.size() != 5) {
					System.out.println("WAIT BEGIN "+System.currentTimeMillis());
					lock.wait();
					System.out.println("wait ends"+System.currentTimeMillis());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
