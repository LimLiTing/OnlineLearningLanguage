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
public class KrnPrivateTutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KrnPrivateTutor() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String classTutor = request.getParameter("ClassTutor");
		
		
		try {
			if(classTutor==" "||classTutor==null) 
			{ throw new Exception(); } 
		  else
		  {
				  if(classTutor.equals("Mrs. Zhou"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseTutorSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(classTutor.equals("Miss Wu"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseTutorSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(classTutor.equals("Mrs. Arya"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseTutorSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(classTutor.equals("Mr. Jai"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseTutorSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(classTutor.equals("Miss Jesse"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseTutorSuccess.jsp");
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
