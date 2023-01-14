package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Section;

/**
 * Servlet implementation class ChnOnline
 */
public class ChnOnline extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChnOnline() {
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
			  
				  if(sec.equals("chinsSec1"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("chinsSec2"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("chinsSec3"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("chinsSec4"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("chinsSec5"))
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
