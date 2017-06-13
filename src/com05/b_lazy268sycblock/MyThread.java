package com05.b_lazy268sycblock;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
		System.out.println(MyObject.getInstance());
	}
}
