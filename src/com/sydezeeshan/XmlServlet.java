package com.sydezeeshan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {

	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter( ); 		
		String userName =   request.getParameter("userName");
		
		// get the session object
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
	   if(userName != ""  && userName != null){

		   session.setAttribute("savedUser", userName);
           context.setAttribute("saved", userName);
	   }
		
		out.println("Requeest parameters has user name as  "+ userName); 
		
 		out.println("session parameters has a user name as " + (String ) session.getAttribute("savedUser"));
 		
 		out.println("Context parameters has a user name as " + (String ) context.getAttribute("saved"));

     //   out.println( "  Hello " + userName + " this of from doGET method   " + FullName + "Your Full Name"  );
	
}
	/* protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 		response.setContentType("text/html");
		 		PrintWriter out = response.getWriter( );
  	     
   	 
		 		String userName =    request.getParameter("userName");
		 		String FullName =    request.getParameter("FullName");  
		 		String prof     =    request.getParameter("prof");
		 		String[] location =    request.getParameterValues("location");
   	 
   	 
		 		out.println( "  Hello " + userName + " this of from doPOST method   " + FullName + "Your Full Name"  );
		 		out.println("Your profession is " + prof);
		 		for(int i = 0 ; i<location.length ;i++)
		 		out.println("You live "+ location[i]);
     
	 }*/
	

	
}
