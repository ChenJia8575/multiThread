package com05.c_innerClass272;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
