package com01.b_synNotExtends;

public class Test {

	public static void main(String[] args) {
		Sub sub = new Sub();
		MyThreadA a = new MyThreadA(sub);
		a.setName("a");
		a.start();
		MyThreadB b = new MyThreadB(sub);
		b.setName("b");
		b.start();
				

	}

}
