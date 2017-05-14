package com02.b_1wait137;

public class Main {

	/*
	 * 会抛异常。因为没有对象监视器，也就是没有同步加锁 。
	 */
	public static void main(String[] args) {
		String str = new String("");
		try {
			str.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
