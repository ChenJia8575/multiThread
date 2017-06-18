package com05.e_enum276;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public enum MyObject {
	connectionFactory;
	//private Connection conn;
	private List conn;
	private MyObject(){
		try {
			System.out.println("invoke MyObject s constructor");
			String url="";
			String username="";
			String password="";
			String drivername="";
			//Class.forName(drivername);
			//conn=DriverManager.getConnection(url,username,password);
			conn=new ArrayList();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List getConnection(){
		return conn;
	}

}
