package CookieTechniques;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Servletone")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String FName = req.getParameter("fname");
		String LName = req.getParameter("lname");
		
		// Create Cookie in servlet 1 and get in servlet2
		Cookie ck = new Cookie("FirstName" , FName);
		resp.addCookie(ck);
		
		Cookie ck1 = new Cookie("Lastname" , LName);
		resp.addCookie(ck1);
		
		
		PrintWriter out = resp.getWriter();
		out.print("<h3> My first name is : " + FName + "</h3>" );
		out.print("<h3> My last name is : " + LName + "</h3>" );
		
		out.print("<a href='ServletTwo'>Servlet2</a>");
	}

	private static final long serialVersionUID = 1L;

}
