

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
public class MlyOnlineClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MlyOnlineClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sec = request.getParameter("sec");
		
		Section s = new Section();
		s.setSec(sec);
		request.setAttribute("s", s);
		
		
		try {
			if(sec==" "||sec==null) 
			{ throw new Exception(); } 
			
		    else
		  {
				  if(sec.equals("mlySec1"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("mlySec2"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("mlySec3"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("mlySec4"))
				  {
					  RequestDispatcher rd=request.getRequestDispatcher("/chooseSecSuccess.jsp");
					  rd.forward(request, response);
				  }
				  else if(sec.equals("mlySec5"))
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
