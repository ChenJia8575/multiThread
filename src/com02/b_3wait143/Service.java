package com02.b_3wait143;

public class Service {
	public void method(Object lock){
		try {
			synchronized (lock){
				System.out.println("begin wait");
				lock.wait();//异步
				//Thread.sleep(3000);/同步
				System.out.println("ends wait");
			}
			
			
			
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
