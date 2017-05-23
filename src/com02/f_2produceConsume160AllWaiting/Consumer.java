package com02.f_2produceConsume160AllWaiting;

public class Consumer {
	private String lock;
	public Consumer(String lock){
		this.lock=lock;
	}
	public void getValue(){
		try {
			synchronized(lock){
				while(ValueObject.value.equals("")){
					System.out.println("consumer " + 
				Thread.currentThread().getName() +" now waiting a");
					lock.wait();
				}
				System.out.println("consumer " + 
				Thread.currentThread().getName() +" now runnable ");
				ValueObject.value="";
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
