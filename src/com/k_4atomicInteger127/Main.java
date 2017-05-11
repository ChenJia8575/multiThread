package com.k_4atomicInteger127;

public class Main {

	public static void main(String[] args) {
		AddCountTread th = new AddCountTread();
		new Thread(th).start();
		new Thread(th).start();
		new Thread(th).start();
		new Thread(th).start();
		new Thread(th).start();
	}

}
