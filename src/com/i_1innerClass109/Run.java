package com.i_1innerClass109;


public class Run {

	public static void main(String[] args) {
		PublicClass pub = new PublicClass();
		pub.setUsername("jj");
		pub.setPassword("123");
		
		PublicClass.PrivateClass pri = pub.new PrivateClass();

		pri.setAge("12");
		pri.setAddress("bbb");
	}

}
