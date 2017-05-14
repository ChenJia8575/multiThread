package com01.i_3innerStaticClass113;

import com01.i_3innerStaticClass113.OutClass.InnerClass1;
import com01.i_3innerStaticClass113.OutClass.InnerClass2;

public class Run {

	public static void main(String[] args) {
		final InnerClass1 inner1 = new InnerClass1();
		final InnerClass2 inner2 = new InnerClass2();
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				inner1.method1(inner2);
			}
		},"T1");
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				inner1.method2();
			}
		},"T2");
		Thread t3 = new Thread(new Runnable(){
			@Override
			public void run() {
				inner2.method();
			}
		},"T3");
		t1.start();
		t2.start();
		t3.start();
	}

}
