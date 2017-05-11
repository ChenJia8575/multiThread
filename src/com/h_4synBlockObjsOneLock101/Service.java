package com.h_4synBlockObjsOneLock101;

public class Service {
	 public static void prnitA(){
		synchronized(Service.class){
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

	}
	public static void prnitB(){
		synchronized(Service.class){
			System.out.println("thread "+ Thread.currentThread().getName()
					+" in printB,time "+System.currentTimeMillis());
			System.out.println("thread "+ Thread.currentThread().getName()
					+" out printB,time "+System.currentTimeMillis());
		}

	}

}
