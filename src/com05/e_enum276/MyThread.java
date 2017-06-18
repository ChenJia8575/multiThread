package com05.e_enum276;

public class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(MyObject.connectionFactory.getConnection().hashCode());
		}
	}
}
