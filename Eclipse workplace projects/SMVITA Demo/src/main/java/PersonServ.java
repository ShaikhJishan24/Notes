

//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
import java.io.PrintWriter;

public class PersonServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String name=request.getParameter("name");
			int age=Integer.parseInt(request.getParameter("age").trim());
			pw.println(name+"          "+age);
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
