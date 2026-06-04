package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;  

@WebServlet("/login-register")
public class Register extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Name = req.getParameter("username");
		int password = Integer.parseInt(req.getParameter("passwd"));
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h3> Name : "+ Name +" </h3>");
		out.print("<h3> password : "+ password +" </h3>");
		
		
		String DB_URL = "jdbc:mysql://localhost:3306/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		// Open a connection
		try{
		
		Class.forName("com.mysql.jdbc.Driver");
		// Obtain a Connection
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        
		String sql = "Insert into User_Detail values(?, ?)";
		
		// Obtain a statement
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1,  Name);
		pstm.setInt(2,  password);
		
		
		// Execute the query
		
		int i = pstm.executeUpdate();
		System.out.println("Data Inserted successfully..." + i);  

		// connnection close
		conn.close(); 	  
		} 
		catch (SQLException | ClassNotFoundException  e) 
		{
			e.printStackTrace();
		} 
	}
	
	
	public static void main(String[] args) {
		
	}

}
