package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class newJDBC {

	public static void main(String[] args) {
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		// Open a connection
		try{
		
		// Obtain a Connection
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        
		String sql = "Insert into Customer values(?, ?, ?, ?, ?, ?)";
		
		// Obtain a statement
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1,  "Om");
		pstm.setString(2,  "98527643");
		pstm.setString(3,  "om@com");
		pstm.setString(4,  "Bandra");
		pstm.setString(5,  "Mira road");
		pstm.setString(6,  "Items");
		
		// Execute the query
		
		int i = pstm.executeUpdate();
		System.out.println("Data Inserted successfully..." + i);  

		// connnection close
		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 

	}

}
