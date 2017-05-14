package com01.d_AsynHalfSynThread;

public class Test {

	public static void main(String[] args){
		Task task = new Task();
		ThreadA a = new ThreadA(task);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(task);
		b.setName("b");
		b.start();
		
	}

}
