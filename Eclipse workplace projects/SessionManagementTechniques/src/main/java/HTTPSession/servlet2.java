package HTTPSession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/2servlet")
public class servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession();
		String n = (String)session.getAttribute("uname");
		
		out.print("Name : " + n);
	}

	private static final long serialVersionUID = 1L;

}
