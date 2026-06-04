package conn.prag;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profileServlet")
public class Profile extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     
        resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		Cookie ck[] = req.getCookies();
		
		
		if(ck == null) {
			
			out.print("Please login first");  
			
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
		else {
			
			out.print("<b>Welcome to Profile</b>");  
            out.print("<br>Welcome, "+ ck[0].getValue()); 
		}
		
		
	}

	private static final long serialVersionUID = 1L;

}
