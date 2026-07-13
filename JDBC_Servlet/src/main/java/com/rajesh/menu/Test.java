package com.rajesh.menu;

import java.sql.Connection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection c=ConnectionProvider.getConnection();
		 if(c!=null)
		 {
			 System.out.println("conected");
		 }
		 else 
		 {
			 System.out.println("not connectedd");
		 }
	}

}
