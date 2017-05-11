package com.k_3volatileNoAtomic124;



public class MyThread extends Thread{
	volatile public static int count;
	//private static void addCount(){
	//加了synchronized static 使锁对象监视器 是 类MyThread.class
	//main方法中可以同步。
	synchronized private static void addCount(){
		for(int i=0;i<100;i++){
			if(i==0)System.out.println("count:"+count);
			count++;
		}
		//System.out.println("count:"+count);
	}
	public void run(){
		addCount();
	}
}
