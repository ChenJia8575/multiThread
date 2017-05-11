package com.j_1changeLock115;

public class Service {
	private String lock="123";
	public void method(){
		try{
			synchronized(lock){
				System.out.println(Thread.currentThread().getName() + "begin " + System.currentTimeMillis());
				lock = "456";
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "end " + System.currentTimeMillis());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
