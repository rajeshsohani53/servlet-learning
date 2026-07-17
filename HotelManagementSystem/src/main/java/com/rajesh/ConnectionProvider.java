package com.rajesh;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletContext;

public class ConnectionProvider {

	public static Connection getConnection(ServletContext context) {
		Connection conn = null;
		try {
			String driver = context.getInitParameter("dbDriver");
			String url = context.getInitParameter("dbUrl");
			String username = context.getInitParameter("dbUsername");
			String password = context.getInitParameter("dbPassword");

			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
