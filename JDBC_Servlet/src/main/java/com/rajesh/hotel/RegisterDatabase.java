package com.rajesh.hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterDatabase {
   public static int save(Register register) throws SQLException
   {
	   Connection con=ConnectionProvider.getConnection();
	   String sql="insert into register(usrname,email,password) VALUES (?,?,?)";
	   PreparedStatement pstmt=con.prepareStatement(sql);
	   pstmt.setString(1,register.getUsrname());
	   pstmt.setString(2,register.getEmail());
	   pstmt.setString(3,register.getPassword());
	   int i=pstmt.executeUpdate();
	   return i;
   }
   
   public static boolean login(Register login) throws SQLException {

	    Connection con = ConnectionProvider.getConnection();

	    String sql = "SELECT * FROM register WHERE usrname = ? AND password = ?";

	    PreparedStatement pstmt = con.prepareStatement(sql);

	    pstmt.setString(1, login.getUsrname());
	    pstmt.setString(2, login.getPassword());

	    ResultSet rs = pstmt.executeQuery();
	    
	    if (rs.next()) {
	        return true;   
	    }
	    return false;      

	    
	}
}
