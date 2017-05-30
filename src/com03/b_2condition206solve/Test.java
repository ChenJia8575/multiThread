package com03.b_2condition206solve;

public class Test {

	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
	}

}
