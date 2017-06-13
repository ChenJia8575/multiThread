package com05.c_doubleCheckLocking270;

public class MyObject {
	private static MyObject myObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		try {
			if (myObject != null) {
			} else {
				Thread.sleep(2000);
				System.out.println(MyObject.class.hashCode());
				synchronized (MyObject.class) {
					if(myObject==null){
						myObject = new MyObject();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
