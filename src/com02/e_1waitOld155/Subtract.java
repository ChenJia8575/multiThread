package com02.e_1waitOld155;

public class Subtract {
	private String lock;
	public Subtract(String lock){
		this.lock=lock;
	}
	public void subtract(){
		try {
			synchronized(lock){
				if(ValueObject.list.size()==0){
					System.out.println("wait begin threadname "+
				               Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait end   threadname "+
				               Thread.currentThread().getName());
				}
				ValueObject.list.remove(0);
				System.out.println("list size "+
						ValueObject.list.size());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
