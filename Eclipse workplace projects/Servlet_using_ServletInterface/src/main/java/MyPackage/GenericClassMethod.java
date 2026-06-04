package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenericClassMethod extends GenericServlet{
    
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest arg0, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.print("In a Generic class Servlet Method");
		out.print(" ");
		out.print(new Date());
		
		System.out.println("Generic Servlet Method");
		
	}
	

}
