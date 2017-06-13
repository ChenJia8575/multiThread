package com05.b_lazy264;

public class MyObject {
	private static MyObject myObject;
	private MyObject(){
	}
	public static MyObject getInstance(){
		//延迟加载
		if(myObject!=null){
			
		}else{
			myObject = new MyObject();
		}
		return myObject;
	}
}
