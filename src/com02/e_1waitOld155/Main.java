package com02.e_1waitOld155;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		String lock= new String("");
		Add add = new Add(lock);
		Subtract subtract = new Subtract(lock);
		ThreadSubtract st1 = new ThreadSubtract(subtract);
		st1.setName("ThreadSubtract1");
		st1.start();
		ThreadSubtract st2 = new ThreadSubtract(subtract);
		st2.setName("ThreadSubtract2");
		st2.start();
		Thread.sleep(1000);
		ThreadAdd addThread = new ThreadAdd(add);
		addThread.setName("addThread");
		addThread.start();
	}
}
