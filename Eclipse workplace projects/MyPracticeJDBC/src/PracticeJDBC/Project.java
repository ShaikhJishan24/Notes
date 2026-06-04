package PracticeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Project {
       
	    public void CreateDB() {
	    	
	    	String DB_URL = "jdbc:mysql://localhost/";
			String USER = "root";
			String PASS = "Jishan@9136";
			
			try{
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

			Statement stmt = conn.createStatement();
		    
			String sql = "create Database client";
			
			stmt.execute(sql);
			
			System.out.println("Database Created successfully...");  

			conn.close(); 	  
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			} 
	    }

		
	    public void CreateTable() {
			String DB_URL = "jdbc:mysql://localhost/Client";
			String USER = "root";
			String PASS = "Jishan@9136";
			
			try{
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

			Statement stmt = conn.createStatement();
		    
			String sql = "create table Project("
					+ "id int ,"
					+ "EmpID int,"
					+ "Name varchar(20),"
					+ "ClientID int "
					+ ")";
			
			stmt.executeUpdate(sql);
			
			System.out.println("Table Created successfully...");  

			conn.close(); 	  
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			} 
		}


		
	    public void InserIntoTable() {
			
	    	String DB_URL = "jdbc:mysql://localhost/Client";
			String USER = "root";
			String PASS = "Jishan@9136";
			
			try{
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

			Statement stmt = conn.createStatement();
		    
			String sql = "insert into Project "
					+ "values(1, 1, 'A',3),"
					+ "(2, 2, 'B', 1),"
					+ "(3, 3, 'C', 5),"
					+ "(4, 4, 'D', 2),"
					+ "(5, 5, 'E', 4);";
			
			stmt.executeUpdate(sql);
			
			System.out.println("Table Created successfully...");  

			conn.close(); 	  
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			} 
			
		}


		
	    public void PreparedStatement() {
	    	String DB_URL = "jdbc:mysql://localhost/Client";
			String USER = "root";
			String PASS = "Jishan@9136";
			
			try{
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
			String sql = "insert into Project values(?, ?, ?, ?)";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
		    
			pstm.setInt(1, 6);
			pstm.setInt(2, 6);
			pstm.setString(3, "F");
			pstm.setInt(4, 7);
			
			pstm.executeUpdate();
			
			System.out.println("Table Created successfully...");  

			conn.close(); 	  
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			} 
			
		}


		
	    public void ResultSet() {
	    	
	    	String DB_URL = "jdbc:mysql://localhost/Client";
			String USER = "root";
			String PASS = "Jishan@9136";
			
			try{
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
			
			Statement stmt = conn.createStatement();
			
			String sql = "select * from Project";
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print(rs.getInt(2));
				System.out.print(rs.getString(3));
				System.out.print(rs.getInt(4));
			}
			
			System.out.println("Data Read successfully...");  
            
			rs.close();
			conn.close(); 
			
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			} 
		}


		
	    public void UpdateData() {

	    	String DB_URL = "jdbc:mysql://localhost/Client";
			String USER = "root";
			String PASS = "Jishan@9136";
			
			try{
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
			String sql = "update project set ClientID = ? where EmpID = ?";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
		    
			pstm.setInt(1, 8);
			pstm.setInt(2, 4);
			
			pstm.executeUpdate();
			
			System.out.println("Data Updated successfully...");  

			conn.close(); 	  
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			} 
			
		}


		
	    public void BatchProcessing() {

	    	String DB_URL = "jdbc:mysql://localhost/Client";
			String USER = "root";
			String PASS = "Jishan@9136";
			
			try{
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	        conn.setAutoCommit(false);
	        
			Statement stmt = conn.createStatement();
		    stmt.addBatch("Insert into Project values(7, 7, 'G', 3)");
		    stmt.addBatch("Insert into Project values(8, 8, 'H', 2 )");
		    stmt.addBatch("Insert into Project values(9, 9, 'I', 4 )");
			
			stmt.executeBatch();
			
			System.out.println("Insertion Done successfully...");  
	        
			conn.commit();
			conn.close(); 	  
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			} 
			
		}

         

}
