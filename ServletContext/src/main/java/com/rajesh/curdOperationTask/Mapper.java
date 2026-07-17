package com.rajesh.curdOperationTask;

import jakarta.servlet.http.HttpServletRequest;

public class Mapper {
   public static Cartoon getDataFrontend(HttpServletRequest req)
   {
	   String cname= req.getParameter("cname");
	   String facCharacter=req.getParameter("facCharacter");
	   String channel=req.getParameter("channel");
	   
	   Cartoon c=new Cartoon(cname, facCharacter, channel);
	   
	   return c;
   }
}
