package loginpage;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Home extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
//		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("uname");
		String password = req.getParameter("passwd");
		
//		if(password.equals("admin8454")) {
//			out.println("you are Successfully login !");
//			out.print("Welcome " + name);
//			
//			Cookie ck1 = new Cookie("username",name);
//			resp.addCookie(ck1);
//		}
//		else {
//			out.print("Sorry username and Password error !");
//			
//			RequestDispatcher rd = req.getRequestDispatcher("index.html");
//			rd.include(req, resp);
//		}
		
		// Creating connection with mysql
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		// Open a connection
		try{
		// Obtain a Connection
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		// Obtain a statement
	    String sql = "insert into user values(?,?)";
	    
	    PreparedStatement pstm = conn.prepareStatement(sql);
	    pstm.setString(1, name);
	    pstm.setString(2, password);
	    
		// Execute the query
	    pstm.executeUpdate();
		System.out.println("Table filled successfully...");
		
		// connnection close
		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
	}
	
	

}
