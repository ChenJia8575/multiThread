package com02.f_2produceConsume160AllWaiting;

public class Producer {
	private String lock;
	public Producer(String lock){
		this.lock=lock;
	}
	public void setValue(){
		
		try {
			synchronized(lock){
				while(!ValueObject.value.equals("")){
					System.out.println("producer " + 
				Thread.currentThread().getName() +" now waiting A");
					lock.wait();
				}
				System.out.println("producer " + 
						Thread.currentThread().getName() +" now runnable ");
				String value = System.currentTimeMillis()+"-"+
				                    System.nanoTime();
				ValueObject.value=value;
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
