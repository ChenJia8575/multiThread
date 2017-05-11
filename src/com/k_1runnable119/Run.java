package com.k_1runnable119;

public class Run {

	public static void main(String[] args) {
		Print print = new Print();
		new Thread(print).start();
		System.out.println("stop it,stopThread = "+Thread.currentThread().getName());
		print.setFlag(false);
	}

}
