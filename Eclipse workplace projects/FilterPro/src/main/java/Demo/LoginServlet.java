package Demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		
		try
		{
			String name=request.getParameter("nm");
			String age=request.getParameter("ag");
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<br>");
			pw.println("in side login servlet<br>");
			pw.println("<br>"+name+"    "+age);
		}
		catch(Exception ee)
		{
			System.out.println("in catch     "+ee);
		}
	}

}
