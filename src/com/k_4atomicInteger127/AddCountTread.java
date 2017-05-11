package com.k_4atomicInteger127;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountTread extends Thread{
	private AtomicInteger count = new AtomicInteger();
	@Override
	public void run() {
		for(int i = 0;i<1000;i++){
			System.out.println(count.incrementAndGet());
		}
	}

}
