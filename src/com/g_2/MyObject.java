package com.g_2;

public class MyObject {
	synchronized public void print(){
		System.out.println(Thread.currentThread().getName()+" get lock ,time:"
	+System.currentTimeMillis());
		System.out.println("-------------");
		System.out.println(Thread.currentThread().getName()+" release lock ,time:"
				+System.currentTimeMillis());
	}
}
