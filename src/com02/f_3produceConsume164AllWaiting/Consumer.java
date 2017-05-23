package com02.f_3produceConsume164AllWaiting;

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
				lock.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
