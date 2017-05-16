package com02.a_2ThreadsTransData139;

public class ThreadB extends Thread {
	private Object lock;

	public ThreadB(Object lock) {
		this.lock = lock;
	}
	public void run() {
		try {
			synchronized(lock){
				for (int i = 0; i < 10; i++) {
					MyList.add();
					if(MyList.size()==5){
						lock.notify();
						System.out.println("now notify");
					}
					System.out.println("added "+(i+1)+" elements");
					Thread.sleep(1000);
				}
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
