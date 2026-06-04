package conn.prag;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logoutServlet")
public class Logout extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");  
        PrintWriter out=resp.getWriter();  
          
          
        Cookie ck = new Cookie("name","");  
        ck.setMaxAge(0);  
        resp.addCookie(ck);  
          
        out.print("you are successfully logged out!"); 
	}

	private static final long serialVersionUID = 1L;

}
