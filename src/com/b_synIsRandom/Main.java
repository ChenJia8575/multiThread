package com.b_synIsRandom;

public class Main {

	public static void main(String[] args) {
		MyList list = new MyList();
		ThreadA a=new ThreadA(list);
		a.setName("a");
		a.start();
		ThreadB b=new ThreadB(list);
		b.setName("b");
		b.start();
	}

}
