package com03.d_1unfair217;

public class RunFair {

	public static void main(String[] args) {
		final Service service = new Service(true);
		Runnable runnable = new Runnable(){
			public void run(){
				System.out.println("A "+Thread.currentThread().getName()
						+" runs");
				service.method();
			}
		};
		Thread[] threadArray = new Thread[10];
		for(int i = 0;i<10;i++){
			threadArray[i]=new Thread(runnable);
		}
		for(int i = 0;i<10;i++){
			threadArray[i].start();
		}
	}
}
