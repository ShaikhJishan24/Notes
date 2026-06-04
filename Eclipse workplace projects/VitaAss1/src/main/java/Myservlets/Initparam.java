package Myservlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


public class Initparam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String value = getServletConfig().getInitParameter("coder");
			pw.println("Init param : " + value);
			String value1 = getServletContext().getInitParameter("group");
			pw.println("<br>");
			pw.println("Context param : " + value1);
		} 
		catch (Exception ee) {
			ee.printStackTrace();
		}
	}

}
