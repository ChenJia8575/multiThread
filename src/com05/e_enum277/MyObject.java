package com05.e_enum277;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MyObject {
	public enum MyEnumSingleton{
		connectionFactory;
		//private Connection conn;
		private List conn;
		private MyEnumSingleton(){
			try {
				System.out.println("create MyObject obj");
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
	public static List getConnection(){
		return MyEnumSingleton.connectionFactory.getConnection();
	}

}
