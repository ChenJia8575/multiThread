package com.c_synPrivObj;

public class Service {
	private String username;
	private String password;
	
	public void set(String username,String password){
		try{//每个线程有自己新new的syn， 所有线程并非锁的同一个对象，
			//所以线程间是异步的，是安全的，是交叉运行的。
			String syn = new String();
			synchronized(syn){
				System.out.println("in "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				this.username=username;
				Thread.sleep(3000);
				this.password=password;
				System.out.println("out "+Thread.currentThread().getName()+" "+System.currentTimeMillis());

			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		
		
	}
	
	
	
	
	
}
