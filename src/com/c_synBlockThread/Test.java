package com.c_synBlockThread;

public class Test {

	public static void main(String[] args) {
		ObjectService ser = new ObjectService();
		ThreadA a = new ThreadA(ser);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(ser);
		b.setName("b");
		b.start();
				

	}

}
