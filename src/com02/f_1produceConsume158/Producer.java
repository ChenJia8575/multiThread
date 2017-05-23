package com02.f_1produceConsume158;

public class Producer {
	private String lock;
	public Producer(String lock){
		this.lock=lock;
	}
	public void setValue(){
		
		try {
			synchronized(lock){
				if(!ValueObject.value.equals("")){
					lock.wait();
				}
				String value = System.currentTimeMillis()+"-"+
				                    System.nanoTime();
				System.out.println("set value is " + value);
				ValueObject.value=value;
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
