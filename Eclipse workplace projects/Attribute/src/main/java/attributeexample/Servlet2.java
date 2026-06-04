package attributeexample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Secondservlet")
public class Servlet2 extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");  
		PrintWriter out = resp.getWriter();  
		
  
		int Add = (Integer) req.getAttribute("Addition");
		out.print("Addition of a and b is : " + Add);
		
	}
	
	
	

}
