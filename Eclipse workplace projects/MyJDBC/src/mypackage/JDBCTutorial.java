package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTutorial {

	public static void main(String[] args) {
		
		String DB_URL = "jdbc:mysql://localhost/";
		String USER = "root";
		String PASS = "Jishan@9136";
		// Open a connection
		try{
		// Obtain a Connection
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		// Obtain a statement
		Statement stmt = conn.createStatement();
	    
		// Execute the query
		String sql = "create Database Ziyana";
		stmt.executeUpdate(sql);
		System.out.println("Database Created successfully...");  

		// connnection close
		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
	}

}
