package requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/HomeServlet")
public class Servlet2welcomepage extends HttpServlet{
      
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			resp.setContentType("text/html");
			
			String UserName = req.getParameter("username");
			
			PrintWriter out = resp.getWriter();
			out.print("<h1>Welcome "+ UserName + " on Home Page</h1>");
			
		}
	public static void main(String[] args) {
		
          
	}

}
