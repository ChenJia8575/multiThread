package com01.k_4atomicInteger128;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Service service = new Service();
		MyThread[] array = new MyThread[5];
		for(int i = 0; i < array.length;i++){
			array[i]=new MyThread(service);
		}
		for(int i = 0; i < array.length;i++){
			array[i].start();
		}
		Thread.sleep(1000);
		System.out.println(service.atomicL.get());
		
	}

}
