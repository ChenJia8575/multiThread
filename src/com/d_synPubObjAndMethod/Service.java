package com.d_synPubObjAndMethod;

public class Service {

	private String syn = new String();
	public void synObj(){
		try{
			synchronized(syn){
				System.out.println("synObj begin");
				Thread.sleep(3000);
				System.out.println("synObj end");
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	synchronized public void synMethod(){
		System.out.println("synMethod begin");
		System.out.println("synMethod end");
	}
}
