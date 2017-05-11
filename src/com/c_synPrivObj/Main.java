package com.c_synPrivObj;

public class Main {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a=new ThreadA(service);
		a.setName("a");
		a.start();
		ThreadB b=new ThreadB(service);
		b.setName("b");
		b.start();
	}

}
