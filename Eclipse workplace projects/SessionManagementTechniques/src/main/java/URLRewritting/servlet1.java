package URLRewritting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servletfirst")
public class servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String Name = req.getParameter("userName");
		
		out.print("Welcome " + Name);
		out.print("<a href='servletsecond?uname="+ Name +"'><br>servlet2</a>");    
		
	}

	private static final long serialVersionUID = 1L;

}

