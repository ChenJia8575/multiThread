package com05.b_lazy267syncblock;

public class MyObject {
	private static MyObject myObject;
	private MyObject(){
	}
	public static MyObject getInstance(){
		try {
			synchronized(MyObject.class){
				System.out.println(Thread.currentThread().getName());
				if(myObject!=null){
				}else{
					Thread.sleep(2000);
					myObject = new MyObject();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
