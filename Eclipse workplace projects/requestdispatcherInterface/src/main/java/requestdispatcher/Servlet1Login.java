package requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class Servlet1Login extends HttpServlet{
     
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String UserName = req.getParameter("username");
		String Password = req.getParameter("passwd");
		
		
		PrintWriter out = resp.getWriter();
	
		
		if(UserName.equals("Moin") && Password.equals("8454")) {
			
			RequestDispatcher rd = req.getRequestDispatcher("HomeServlet");
			rd.forward(req, resp);
//			
//			sendRedirect() method of response 
//			resp.sendRedirect("HomeServlet");  // this only works with get method so add get in method to run this
//			resp.sendRedirect("http://www.google.com");	
		}
		else 
		{
			out.print("Sorry UserName or Password Incorrect Error!");
			
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);  // index.html page include hoga
		}
		
	}

	private static final long serialVersionUID = 1L;

}
