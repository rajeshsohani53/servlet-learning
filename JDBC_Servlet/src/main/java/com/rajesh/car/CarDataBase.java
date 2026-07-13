package com.rajesh.car;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CarDataBase {
   Connection con=ConnectionProvider.getConnection();
   
   public int save(Car c)
   {
	   try
	   {
		   String sql="insert into car(carName,carNumber,carModel,carCompany) VALUES(?,?,?,?)";
		  PreparedStatement pstmt=con.prepareStatement(sql);
		  pstmt.setString(1,c.getCarName());
		  pstmt.setString(2,c.getCarNumber());
		  pstmt.setString(3,c.getCarModel());
		  pstmt.setString(4,c.getCarCompany());
		  int i=pstmt.executeUpdate();
		  
		  return i;
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return 0;
   }
}
