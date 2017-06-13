package com05.b_lazy267syncblock;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
