package com01.k_4atomicInteger128;

import java.util.concurrent.atomic.AtomicLong;

public class Service {
	public static AtomicLong atomicL = new AtomicLong();
	public void addNum(){
		System.out.println(Thread.currentThread().getName()+" 加了100之后的值是 "+
				atomicL.addAndGet(100));
		atomicL.addAndGet(1);
	}
}
