package MyPackage;

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

public class RegistrationServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
    
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Name = req.getParameter("Name");
		String phoneNumber = req.getParameter("phonenumber");
		String Email_id = req.getParameter("email");
		String Origin = req.getParameter("origin");
		String Destination = req.getParameter("destination");
		String Household = req.getParameter("Items");
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h3>Your Quote</h3>");
		out.print("<h3> Name : "+ Name +" </h3>");
		out.print("<h3> phoneNumber : "+ phoneNumber +" </h3>");
		out.print("<h3> Email_id : "+ Email_id +" </h3>");
		out.print("<h3> Origin : "+ Origin +" </h3>");
		out.print("<h3> Destination : "+ Destination +" </h3>");
		out.print("<h3> Household : "+ Household +" </h3>");
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		// Open a connection
		try{
		Class.forName("com.mysql.jdbc.Driver");
		// Obtain a Connection
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        
		String sql = "Insert into Customer values(?, ?, ?, ?, ?, ?)";
		
		// Obtain a statement
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1,  Name);
		pstm.setString(2,  phoneNumber);
		pstm.setString(3,  Email_id);
		pstm.setString(4,  Origin);
		pstm.setString(5,  Destination);
		pstm.setString(6,  Household);
		
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















