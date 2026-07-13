package com.rajesh.menu;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MenuRepo 
{
     public static int save(Menu menu)
     {
    	 Connection con=ConnectionProvider.getConnection();
    	   
    	   try
    	   {
    		   String sql="insert into chai(item,price,description) VALUES (?,?,?)";
    		   PreparedStatement pstmt=con.prepareStatement(sql);
    		   pstmt.setString(1, menu.getItem());
    		   pstmt.setString(2, menu.getPrice());
    		   pstmt.setString(3, menu.getDesc());
    		   int i=pstmt.executeUpdate();
    		   return i;
    		   
    	   }catch(Exception e)
    	   {
    		   e.printStackTrace();
    	   }
    	   return 0;
     }
}
