package com.i_3innerStaticClass113;

public class OutClass {
	static class InnerClass1{
		public void method1(InnerClass2 class2){
			String threadName = Thread.currentThread().getName();
			synchronized(class2){
				System.out.println(threadName +" into InnerClass1.method1");
				for(int i=1; i<=10;i++){
					System.out.println(Thread.currentThread().getName()+"i="+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(threadName +" leave InnerClass1.method1");
			}
		}
		public synchronized void method2(){
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName +" into InnerClass1.method2");
			for(int j=1; j<=10;j++){
				System.out.println(Thread.currentThread().getName()+"i="+j);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(threadName +" leave InnerClass1.method2");
		}
	}
	static class InnerClass2{
		public synchronized void method(){
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName +" into InnerClass2.method");
			for(int k=1; k<=10; k++){
				System.out.println("k="+k);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(threadName +" leave InnerClass2.method");
		}
	}
}
