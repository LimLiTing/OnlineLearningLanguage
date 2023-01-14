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
public class EngPrivateTutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EngPrivateTutor() {
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
				  if(classTutor.equals("Miss Ann"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseTutorSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(classTutor.equals("Mr. Samual"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseTutorSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(classTutor.equals("Mrs. Arina"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseTutorSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(classTutor.equals("Mr. Ali"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseTutorSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(classTutor.equals("Miss Janna"))
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
