package com02.b_1wait137;

public class MainBetter {

	/*
	 * 会抛异常。因为没有对象监视器，也就是没有同步加锁 。
	 */
	public static void main(String[] args) {
		
		try {
			String lock = new String("");
			System.out.println("synchronized 上面");
			synchronized(lock){
				System.out.println("sync 第一行");
				lock.wait();
				System.out.println("wait 后的代码");
				
			}
			System.out.println("synchronized 下面");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
