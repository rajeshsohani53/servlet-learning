package com.rajesh.curdOperationTask;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	public Connection conn;
	public Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/cartoondb";
			String username="javauser";
			String password="password123";
			conn=DriverManager.getConnection(url,username,password);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
}
