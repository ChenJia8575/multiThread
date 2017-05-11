package com.f_MyOneList2;

public class Test {

	public static void main(String[] args) throws InterruptedException{
		MyOneList list = new MyOneList();
		ThreadA a = new ThreadA(list);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(list);
		b.setName("b");
		b.start();
		Thread.sleep(2009);
		System.out.println("list.getSize():"+list.getSize());
	}

}
