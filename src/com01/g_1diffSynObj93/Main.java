package com01.g_1diffSynObj93;

public class Main {
//异步的原因是使用了不同的"对象监视器"。a1与a2是异步，a2与b是同步。
	public static void main(String[] args) {
		Service service = new Service();
		MyObject obj1 = new MyObject();
		MyObject obj2 = new MyObject();
		ThreadA a1 = new ThreadA(service,obj1);
		a1.setName("a1");
		
		ThreadA a2 = new ThreadA(service,obj2);
		a2.setName("a2");
		ThreadB b = new ThreadB(service,obj2);
		b.setName("b");
		a2.start();
		a1.start();
		b.start();
	}
}
