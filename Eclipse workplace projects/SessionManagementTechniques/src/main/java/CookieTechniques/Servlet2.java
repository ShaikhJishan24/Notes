package CookieTechniques;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletTwo")
public class Servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		// GetCookie in servlet2 from servlet1
		Cookie ck[] = req.getCookies();
				
		Cookie ck1[] = req.getCookies();
		out.print("<h3>  Name is : " + ck[0].getValue()+" "+ ck1[1].getValue() +"</h3>");
	}

	private static final long serialVersionUID = 1L;

}
