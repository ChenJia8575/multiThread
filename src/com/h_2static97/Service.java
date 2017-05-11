package com.h_2static97;

public class Service {
	synchronized public static void prnitA(){
		try{
			System.out.println("thread "+ Thread.currentThread().getName()
					+" in printA,time "+System.currentTimeMillis());
			Thread.sleep(3000);
			System.out.println("thread "+ Thread.currentThread().getName()
					+" out printA,time "+System.currentTimeMillis());
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	synchronized public static void prnitB(){
		System.out.println("thread "+ Thread.currentThread().getName()
				+" in printB,time "+System.currentTimeMillis());
		System.out.println("thread "+ Thread.currentThread().getName()
				+" out printB,time "+System.currentTimeMillis());
	}
	synchronized public void prnitC(){
		System.out.println("thread "+ Thread.currentThread().getName()
				+" in prnitC,time "+System.currentTimeMillis());
		System.out.println("thread "+ Thread.currentThread().getName()
				+" out prnitC,time "+System.currentTimeMillis());
	}
}
