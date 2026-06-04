package mypackage;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Student {
    
	public void CreateDB() {
		String DB_URL = "jdbc:mysql://localhost/";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		Statement stmt = conn.createStatement();
	    
		String sql = "create Database Ziyana";
		stmt.executeUpdate(sql);
		System.out.println("Database Created successfully...");  

		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
	};
    
	public void createTable() {
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		Statement stmt = conn.createStatement();
	    
		String sql = "create table Info(\r\n"
				+ "   id int,\r\n"
				+ "   Name varchar(20),\r\n"
				+ "   Roll_no int\r\n"
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
    
	public void InsertintoTable() {
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		Statement stmt = conn.createStatement();
	    
		String sql = "insert into info\r\n"
				   + "values(1, \"John\", 20),\r\n"
				   + "      (2, \"Doe\", 21);";
		int i = stmt.executeUpdate(sql);
		System.out.println("Table filled successfully..." + i);  

		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
	}
	
	public void preparedstatements(){
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    
		String sql = "insert into Employee (Emp_Id, Name, Age) values(?,?,?)";
		
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setInt(1, 102);
		psmt.setString(2, "Sam");
		psmt.setInt(3, 25);
		
		
		int i = psmt.executeUpdate();
		System.out.println("Table filled successfully..." + i);  

		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
	}
    
	// retrive data from the table (Select Statment)
	public void resultset() {
		
		String DB_URL = "jdbc:mysql://localhost:3306/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		Statement stmt = conn.createStatement();
	    
		String sql = "select * from Employee";
		
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));	
		}
		
		System.out.println("Data Read successfully...");  

		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
	}
	
	public void updateData() {
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		Statement stmt = conn.createStatement();
	    
		String sql = "update Employee set Name = 'kiara' where Emp_Id = 101 ";
		int i = stmt.executeUpdate(sql);
		System.out.println("Table Update successfully..." + i);  

		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
	}
    
	// Update data using Preparedstatment 
	public void updateDataNew() {
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    
		String sql = "update Employee set Age = ? where Emp_Id = ? ";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, 30);
		pstm.setInt(2, 102);
	   
	    
		pstm.executeUpdate();
		System.out.println("Table Update successfully...");  

		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
	}
	
	public void Deletedata() {
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		Statement stmt = conn.createStatement();
	    
		String sql = "Delete from Employee where Emp_Id = 102";
		
		stmt.execute(sql);   // executeQuery will not work here 
		
		System.out.println("Data Deleted successfully...");  

		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
	}
	
	public void truncateData() {
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		Statement stmt = conn.createStatement();
	    
		String sql = "truncate table Employee";
		
		stmt.execute(sql);   // executeQuery will not work here 
		
		System.out.println("Data Deleted successfully...");  

		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
	}
	
	// to Call the Procedure
	public void callablestatements() {
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

//		String sql = "call InsertData(105, 'Rekha', 54)";
		
		// Without hardcoding value
		String sql = "call InsertData(?, ?, ?)";
		CallableStatement cstm = conn.prepareCall(sql);
        cstm.setInt(1, 106);
        cstm.setString(2, "Saniya");
        cstm.setInt(3, 44);
        
		cstm.executeUpdate();   
		
		System.out.println("Insertion Done successfully...");  

		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
		
	}
	
	// to Call the function 
	public void callablestatements1() {
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
		String sql = "Select AddNumbers(50, 10) As Addition";
		
		CallableStatement cstm = conn.prepareCall(sql);
      
		cstm.executeQuery();   
		
		System.out.println("Function call successfully...");  

		conn.close(); 	  
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
		
	}
	
	public void batchProUsingstatement() {
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        conn.setAutoCommit(false);
        
		Statement stmt = conn.createStatement();
	    stmt.addBatch("Insert into Employee values(107, 'Chetan', 23)");
	    stmt.addBatch("Insert into Employee values(108, 'Prashant', 22 )");
	    stmt.addBatch("Insert into Employee values(109, 'Daivik', 20 )");
		
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
    
	public void batchProUsingPreparedstatement() {
		
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        conn.setAutoCommit(false);
        
        Scanner in = new Scanner(System.in);
        
        String sql = "insert into Employee values(?, ?, ?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
	    while(true) {
	    	System.out.print("Enter Emp_Id: ");
	    	int Emp_Id = in.nextInt();
	    	
	    	System.out.print("Enter Name: ");
	    	String Name = in.next();
	    	
	    	System.out.print("Enter Age: ");
	    	int Age = in.nextInt();
	    	
	    	pstm.setInt(1, Emp_Id);
	    	pstm.setString(2, Name);
	    	pstm.setInt(3, Age);
	    	
	    	pstm.addBatch();
	    	
	    	System.out.println("Do you want to add More Y/N: ");
	    	String ans = in.next();
	    	if(ans.toUpperCase().equals("N")) {
	    		break;
	    	}
	    	
	    }
		
		pstm.executeBatch();
		
		System.out.println("Insertion Done successfully...");  
        
		in.close();
		conn.commit();
		
		conn.close();
		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
	}
	
	public void TransactionHandling() {
	       
		String DB_URL = "jdbc:mysql://localhost/Ziyana";
		String USER = "root";
		String PASS = "Jishan@9136";
		
		try{
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        conn.setAutoCommit(false);

		String Withdraw = "Update Accounts set balance = balance - ? where Acc_no = ? ";
		String Deposit = "Update Accounts set balance = balance + ? where Acc_no = ? ";
            
			try{
				PreparedStatement pstm1 = conn.prepareStatement(Withdraw);
				PreparedStatement pstm2 = conn.prepareStatement(Deposit);
					
				pstm1.setDouble(1, 500);
				pstm1.setInt(2, 123);

				pstm2.setDouble(1, 500);
				pstm2.setInt(2, 786);

				int rowsaffedcted = pstm1.executeUpdate();  // Here Ans1 and Ans2 Gives you how many Rows Are Affected
				int rowsaffedcted1 = pstm2.executeUpdate();

				if(rowsaffedcted > 0 && rowsaffedcted1 > 0){
					conn.commit();
					System.out.println("Transaction (query) done successfully...");  
				}else{
					conn.rollback();
					System.out.println("Trnsaction (query) Failed !!! ");
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			}

		conn.close(); 	  

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
	}

}








