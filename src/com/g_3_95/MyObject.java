package com.g_3_95;

public class MyObject {
	public void print(){
		synchronized(this){
			System.out.println(Thread.currentThread().getName()+" get lock ,time:"
				+System.currentTimeMillis());
			System.out.println("-------------");
			System.out.println(Thread.currentThread().getName()+" release lock ,time:"
				+System.currentTimeMillis());
		}
		
	}
}
