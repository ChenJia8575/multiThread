package com.g_1sameSynObj91;

public class Main {
//同步的原因是使用了同一个"对象监视器"
	public static void main(String[] args) {
		Service service = new Service();
		MyObject obj = new MyObject();
		ThreadA a1 = new ThreadA(service,obj);
		a1.setName("a1");
		
		ThreadA a2 = new ThreadA(service,obj);
		a2.setName("a2");
		ThreadB b = new ThreadB(service,obj);
		b.setName("b");
		a2.start();
		a1.start();
		b.start();
	}
}
