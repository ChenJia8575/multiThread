package com01.b_synIsRandom;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List list = new ArrayList<>();
	
	synchronized public void add(String username){
		System.out.println(Thread.currentThread().getName()+" in add ");
		list.add(username);
		System.out.println(Thread.currentThread().getName()+" out add ");
	}
	
	synchronized public int getSize(){
		System.out.println(Thread.currentThread().getName()+" in getSize ");
		int size = list.size();
		System.out.println(Thread.currentThread().getName()+" out getSize ");
		return size;
	}
}
