package com.rajesh.hotel;

import java.sql.Connection;
public class Test {
  public static void main(String[] args) {
	  Connection con=ConnectionProvider.getConnection();
	  if(con!=null)
	  {
		  System.out.println("connected");
	  }else
	  {
		System.out.println("not connected");  
	  }
}
}

