package com05.c_doubleCheckLocking270;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
