package attributeexample;

import java.io.IOException;
//import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Firstservlet")
public class Servlet1 extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");  
//		PrintWriter out=resp.getWriter();  
		
		
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		
		int Sum = n1 + n2;
		req.setAttribute("Addition", Sum);
			
		RequestDispatcher rd = req.getRequestDispatcher("Secondservlet");
		rd.forward(req, resp);
			
	}
	
	

}
