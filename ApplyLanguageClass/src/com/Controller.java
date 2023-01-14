package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Class;


/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String language = request.getParameter("language"); 
		

		Class c = new Class();
		c.setLanguage(language);
		request.setAttribute("c",c);
		
		try {
			if(language==" "||language==null) 
			{ throw new Exception(); } 
			else 
			{  
				if(language.equals("English"))
				  {
					RequestDispatcher rd=request.getRequestDispatcher("English/englishPage.jsp");
					  rd.forward(request, response);
				  }
				else if(language.equals("Malay"))
				  {
					RequestDispatcher rd=request.getRequestDispatcher("Malay/malayPage.jsp");
					  rd.forward(request, response);
				  }
				else if(language.equals("Chinese"))
				  {
					RequestDispatcher rd=request.getRequestDispatcher("Chinese/chinesePage.jsp");
					  rd.forward(request, response);
				  }
				else if(language.equals("Japanese"))
				  {
					RequestDispatcher rd=request.getRequestDispatcher("Japanese/japanesePage.jsp");
					  rd.forward(request, response);
				  }
				else if(language.equals("Korean"))
				  {
					RequestDispatcher rd=request.getRequestDispatcher("Korean/koreanPage.jsp");
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
