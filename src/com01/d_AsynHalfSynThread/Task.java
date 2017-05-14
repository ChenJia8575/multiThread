package com01.d_AsynHalfSynThread;

public class Task {

	public void doLongTask() {
		try {
			for (int i = 1; i <= 100; i++) {
				Thread.sleep(50);
				System.out.println("no-synchronized threadname=" + Thread.currentThread().getName() + " i=" + i);
			}
			System.out.println("");

			synchronized (this) {
				for (int i = 1; i <= 100; i++) {
					Thread.sleep(10);
					System.out.println("synchronized threadname=" + Thread.currentThread().getName() + " i=" + i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
