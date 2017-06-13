package com05.b_lazy268sycblock;

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
					myObject = new MyObject();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
