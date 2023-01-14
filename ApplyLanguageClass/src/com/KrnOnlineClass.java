package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Section;
import model.Tutor;

/**
 * Servlet implementation class EngOnlineClass
 */
public class KrnOnlineClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KrnOnlineClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String sec = request.getParameter("sec");
		
		
		try {
			if(sec==" "||sec==null) 
			{ throw new Exception(); } 
		  else
		  {
			  
				  if(sec.equals("krnSec1"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("krnSec2"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("krnSec3"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("krnSec4"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("krnSec5"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
			  }
		}
		catch(Exception e)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/ErrorPage.jsp");
			  rd.forward(request, response);
		}
	}
}
