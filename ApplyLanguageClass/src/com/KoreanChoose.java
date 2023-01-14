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
 * Servlet implementation class KoreanChoose
 */
public class KoreanChoose extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KoreanChoose() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String choice = request.getParameter("choice");
		
		
		try {
			if(choice==" "||choice==null) 
			{ throw new Exception(); } 
		  else
		  {
			  if(choice.equals("online class"))
			  {
				  RequestDispatcher rd=request.getRequestDispatcher("Korean/OnlineClassKorean.jsp");
				  rd.forward(request, response);
			  }
			  else if(choice.equals("personal tutor"))
			  {
				  RequestDispatcher rd=request.getRequestDispatcher("Korean/PersonalTutorKorean.jsp");
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
