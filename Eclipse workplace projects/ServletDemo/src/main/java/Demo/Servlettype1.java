package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/NewServ")
public class Servlettype1 implements Servlet{
  

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Init method calls");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");  
		  
		PrintWriter out= res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>This Is my first Servelts of today practice</b>");  
		out.print("</body></html>");  
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy the servlets");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
