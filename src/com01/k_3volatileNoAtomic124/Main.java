package com01.k_3volatileNoAtomic124;

public class Main {

	public static void main(String[] args) {
		MyThread[] threads = new MyThread[100];
		for(int i=0;i<100;i++){
			threads[i]=new MyThread();
		}
		for(int i=0;i<100;i++){
			threads[i].start();
		}
	}
}
