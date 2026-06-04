package HiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/onesirvlet")
public class servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String Name = req.getParameter("userName");
		
		out.print("<form action='secondServlet'>");  
        out.print("<input type='hidden' name='uname' value='"+Name+"'>");  
        out.print("<input type='submit' value='Servlet2'>");  
        out.print("</form>");  
		
	}

	private static final long serialVersionUID = 1L;

}
