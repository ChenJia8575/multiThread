package com05.c_innerClass273serializable;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
