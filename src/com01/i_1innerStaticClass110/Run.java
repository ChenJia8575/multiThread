package com01.i_1innerStaticClass110;


public class Run {

	public static void main(String[] args) {
		PublicClass pub = new PublicClass();
		pub.setUsername("jj");
		pub.setPassword("123");
		
		PublicClass.PrivateClass pri = new PublicClass.PrivateClass();

		pri.setAge("12");
		pri.setAddress("bbb");
	}

}
