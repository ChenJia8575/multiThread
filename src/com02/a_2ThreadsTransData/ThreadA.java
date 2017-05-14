package com02.a_2ThreadsTransData;

public class ThreadA extends Thread {
	private MyList list;

	public ThreadA(MyList list) {
		this.list = list;
	}
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				list.add();
				System.out.println("added "+(i+1)+" elements");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
