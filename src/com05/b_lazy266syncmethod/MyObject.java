package com05.b_lazy266syncmethod;

public class MyObject {
	private static MyObject myObject;
	private MyObject(){
	}
	synchronized public static MyObject getInstance(){
		System.out.println(Thread.currentThread().getName());
		try {
			if(myObject!=null){
			}else{
				Thread.sleep(2000);
				myObject = new MyObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
