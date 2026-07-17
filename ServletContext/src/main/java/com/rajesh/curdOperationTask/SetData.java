package com.rajesh.curdOperationTask;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SetData {

    public static void main(String[] args) {

        try {

            ConnectionProvider c = new ConnectionProvider();
            Connection con = c.getConnection();

            PreparedStatement stmt = con.prepareStatement(
                "insert into cartoon(cname,facCharacter,channel) values(?,?,?)");
            Cartoon c1=new Cartoon("Doremon","Nobita", "hungama");
            stmt.setString(1, c1.getCname());
            stmt.setString(2, c1.getFacCharacter());
            stmt.setString(3, c1.getChannel());
            int rows = stmt.executeUpdate();

            System.out.println(rows + " Data inserted successfully Thankyou ");

            
            
            Cartoon c2=new Cartoon("Chhota Bhim","Kalia", "pogo");
            stmt.setString(1, c2.getCname());
            stmt.setString(2, c2.getFacCharacter());
            stmt.setString(3, c2.getChannel());
            int rows1 = stmt.executeUpdate();

            System.out.println(rows1 + " Data inserted successfully Thankyou ");

            
            Cartoon c3=new Cartoon("Car","Lightning Muqueen", "Disney");
            stmt.setString(1, c3.getCname());
            stmt.setString(2, c3.getFacCharacter());
            stmt.setString(3, c3.getChannel());
            
            int rows2 = stmt.executeUpdate();

            System.out.println(rows2+ " Data inserted successfully Thankyou ");

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static int insert(Cartoon c)
    {
    	try
    	{
    		ConnectionProvider c1 = new ConnectionProvider();
            Connection con = c1.getConnection();

            PreparedStatement stmt = con.prepareStatement(
                "insert into cartoon(cname,facCharacter,channel) values(?,?,?)");
            stmt.setString(1, c.getCname());
            stmt.setString(2,c.getFacCharacter());
            stmt.setString(3,c.getChannel());
            int rows = stmt.executeUpdate();
            return rows;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	return 0;
    }
    
    
    public static int update(Cartoon c)
    {
    	try
    	{
    		ConnectionProvider c1 = new ConnectionProvider();
            Connection con = c1.getConnection();

            PreparedStatement ps = con.prepareStatement(
            	    "UPDATE cartoon SET cname = ?, facCharacter = ? WHERE channel = ?"
            	);

            ps.setString(1, c.getCname());
            ps.setString(2,c.getFacCharacter());
            ps.setString(3,c.getChannel());
            int rows = ps.executeUpdate();
            return rows;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	return 0;
    }
    
    
    
}