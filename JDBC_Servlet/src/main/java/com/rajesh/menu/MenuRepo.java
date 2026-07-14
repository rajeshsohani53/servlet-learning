package com.rajesh.menu;
import com.rajesh.menu.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

//import com.mysql.cj.protocol.Resultset;
//import com.mysql.cj.protocol.ResultsetRows;

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
     
 	public static Menu[] getdata() {
		// TODO Auto-generated method stub
		ConnectionProvider c=new ConnectionProvider();
		try
		{
		    Connection con = c.getConnection();

		    Statement stmt = con.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY
		    );

		    ResultSet rs = stmt.executeQuery("select * from chai");

		    rs.last();
		    int size = rs.getRow();
		    rs.beforeFirst();

		    Menu[] menu = new Menu[size];

		    int i = 0;

		    while(rs.next())
		    {
		        Menu m = new Menu();
		        m.setItem(rs.getString(1));
		        m.setPrice(rs.getString(2));
		        m.setDesc(rs.getString(3));

		        menu[i] = m;
		        i++;
		    }

		    return menu;
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		}

		return null;

	}
     
}
