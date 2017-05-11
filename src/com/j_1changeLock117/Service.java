package com.j_1changeLock117;

public class Service {
	
	public void method(Userinfo user){
		try{
			synchronized(user){
				System.out.println(Thread.currentThread().getName() + "begin " + System.currentTimeMillis());
				//user的属性变了，但是锁的是obj引用依然没变。别的线程依然还是阻塞等待。
				user.setUsername("2");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "end " + System.currentTimeMillis());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
