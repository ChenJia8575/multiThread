package com02.d_1waitLong151;

public class MyRunnable {

	static private Object lock = new Object();
	static private Runnable runnable = new Runnable(){
		public void run() {
			try {
				synchronized(lock){
					System.out.println("wait begin time "+
				System.currentTimeMillis());
					lock.wait(2000);
					System.out.println("wait end time "+
							System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
	};
	
	public static void main(String[] args) {
		Thread t = new Thread(runnable);
		t.start();
	}
	
	
	
	
	
}
