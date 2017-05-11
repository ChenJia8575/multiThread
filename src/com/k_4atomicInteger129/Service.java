package com.k_4atomicInteger129;

import java.util.concurrent.atomic.AtomicLong;

public class Service {
	public static AtomicLong atomicL = new AtomicLong();
	public synchronized void addNum(){
		System.out.println(Thread.currentThread().getName()+" 加了100之后的值是 "+
				atomicL.addAndGet(100));
		atomicL.addAndGet(1);
	}
}
