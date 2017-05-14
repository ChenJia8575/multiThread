package com01.e_MyOneList;

public class MyService {
	public MyOneList serviceAdd(MyOneList list,String data){
		try{
			if(list.getSize()==0){
				Thread.sleep(2000);
				list.add(data);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		return list;
	}
}
