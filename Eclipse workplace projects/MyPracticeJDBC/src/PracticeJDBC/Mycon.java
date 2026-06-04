package PracticeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class Mycon {

	static Connection con;
	static ResourceBundle rb;
	
	static {
		try {
			rb = ResourceBundle.getBundle("app.properties");
			Class.forName(rb.getString("driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		try {
			String url, user, password;

			url = rb.getString("url");
			user = rb.getString("user");
			password = rb.getString("password");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception ee) {
			System.out.println(ee);
		}
		return con;
	}
}
