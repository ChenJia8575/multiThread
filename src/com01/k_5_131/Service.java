package com01.k_5_131;

public class Service {
	private boolean go_on = true;
	public void method(){
		String obj = new String();
		while(go_on){
			synchronized(obj){
			}
		}
		System.out.println("stoped");
	}
	public void stop(){
		go_on=false;
	}
	
	
}
