package com.rajesh.car;

import java.sql.Connection;

public class Test {
  public static void main(String[] args) {
	Connection c=ConnectionProvider.getConnection();
	if(c!=null)
	{
		System.out.println("Connected");
	}else
	{
		System.out.println("not connected ");
	}
}
}
