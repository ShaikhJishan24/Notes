

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig conf)throws ServletException
	{
		super.init(conf);
		System.out.println("inside init(ServletConfig conf) method");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter pw=response.getWriter();
		pw.println("Overriding init(ServletConfig conf) and invoking parent init(ServletConfig conf)");
		/* No Problem for following 2 statements*/
		pw.println("Config parameter value  "+getServletConfig().getInitParameter("user"));
		pw.println("Context parameter value   "+getServletContext().getInitParameter("database"));
		
	}
}
