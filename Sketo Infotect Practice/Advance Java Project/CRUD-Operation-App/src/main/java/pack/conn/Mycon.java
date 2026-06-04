package pack.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mycon {
          
	   public static Connection dbcon() {
		   
		   Connection con = null;
		   
		   String DB_URL = "jdbc:mysql://localhost/newdb";
		   String USER = "root";
		   String PASS = "Jishan@9136";
		   try {
			    con = DriverManager.getConnection(DB_URL, USER, PASS);
			   
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		   return con;
	   }
}
