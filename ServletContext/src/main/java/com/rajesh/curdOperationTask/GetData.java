package com.rajesh.curdOperationTask;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetData {

	public static Cartoon[] getAllData() {
		// TODO Auto-generated method stub
		ConnectionProvider c=new ConnectionProvider();
		try
		{
			Connection con=c.getConnection();
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=stmt.executeQuery("select * from cartoon");
			rs.last();
			int size=rs.getRow();
			rs.beforeFirst();
			Cartoon[] car = new Cartoon[size];
			int i=0;
			while(rs.next())
			{
				Cartoon m = new Cartoon();
		        m.setCname(rs.getString(1));
		        m.setFacCharacter(rs.getString(2));
		        m.setChannel(rs.getString(3));
		        
		        car[i]=m;
		        i++;
				
			}
			return car;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;

	}

}