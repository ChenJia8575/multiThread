package com.i_2innerStaticClass112;

import com.i_2innerStaticClass112.OutClass.Inner;

public class Run {

	public static void main(String[] args) {
		final Inner inner = new Inner();
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				inner.method1();
			}
		},"A");
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				inner.method2();
			}
		},"B");
		t1.start();
		t2.start();

	}

}
