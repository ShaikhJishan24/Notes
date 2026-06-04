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

@WebServlet("/LoginServlet")
public class Login extends HttpServlet{


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String passwd = req.getParameter("password");
		
		if(passwd.equals("admin123")) {
			out.print("You are successfully logged in!");
			out.print("<br>Welcome, "+ name); 
			
			Cookie ck = new Cookie("name", name);
			resp.addCookie(ck);
		}
		else {
			
			out.print("sorry, username or password error!");  
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
		
		
	}

	private static final long serialVersionUID = 1L;

}
