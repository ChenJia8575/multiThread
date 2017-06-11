package com05.a_immediate263;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
