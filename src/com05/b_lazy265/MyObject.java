package com05.b_lazy265;

public class MyObject {
	private static MyObject myObject;
	private MyObject(){
	}
	public static MyObject getInstance(){
		try {
			//延迟加载
			if(myObject!=null){
			}else{
				Thread.sleep(1000);
				myObject = new MyObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
