package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ServletInterfaceMethod implements Servlet{


	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("In a INIT Method It is Invoked only once");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");  
		  
		PrintWriter out= res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>hello simple servlet</b>");  
		out.print("</body></html>");  
		
		
	}
    
	@Override
	public void destroy() {
		System.out.println("It is invoked after server send response to request");
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}
}
