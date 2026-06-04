package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpservletMethod extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
	   
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Do Get Method Run Successfully...");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
		resp.setContentType("text/html");
		String Firstname = req.getParameter("FirstName"); 
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h3> Your Firstname is  : "+ Firstname +" </h3>");
		
		System.out.println("Do Post Method Run Successfully...");
		
	}
    
	
}
