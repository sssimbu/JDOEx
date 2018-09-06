package com.jdo.example;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.urlfetch.HTTPResponse;

public class AddPerson extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		
		
		String name=request.getParameter("name");
		System.out.println("entered value is"+name);
		
		person per=new person(name);
		
	    PersistenceManager pm = PMF.get().getPersistenceManager();


	    
	    try{
	    	pm.makePersistent(per);
	    }
	    finally{
	    	pm.close();
	    }
	
	response.sendRedirect("show.jsp");
	}

	

}
