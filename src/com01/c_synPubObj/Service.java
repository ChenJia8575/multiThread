package com01.c_synPubObj;

public class Service {
	private String username;
	private String password;
	private String syn = new String();
	public void set(String username,String password){
		try{
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
