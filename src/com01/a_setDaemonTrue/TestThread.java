package com01.a_setDaemonTrue;

import java.io.IOException;

public class TestThread extends Thread {

	public TestThread() {
	}

	/** */
	/**
	 * 线程的run方法，它将和其他线程同时运行
	 */
	public void run() {
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(100);

			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestThread test = new TestThread();
		// 如果不设置daemon，那么线程将输出100后才结束
		//test.setDaemon(true);
		test.start();
		System.out.println("isDaemon = " + test.isDaemon());

	}
}