package com02.f_1produceConsume158;

public class Consumer {
	private String lock;
	public Consumer(String lock){
		this.lock=lock;
	}
	public void getValue(){
		try {
			synchronized(lock){
				if(ValueObject.value.equals("")){
					lock.wait();
				}
				String value = System.currentTimeMillis()+"-"+
				                    System.nanoTime();
				System.out.println("get value is " + ValueObject.value);
				ValueObject.value="";
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
