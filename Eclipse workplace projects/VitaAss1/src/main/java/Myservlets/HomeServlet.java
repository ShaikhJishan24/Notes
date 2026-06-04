package Myservlets;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypack.Mycon;

import java.io.PrintWriter;
import java.sql.*;

import javax.sql.DataSource;


@WebServlet("/Bookservlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Connection con;
	
	@Resource(lookup="java:/comp/env/mypool")
	private DataSource ds;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		String sql = "select * from Book";
	
		try {
			con = ds.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			PrintWriter out = response.getWriter();
			while(rs.next()) {
				out.println("Id : " + rs.getInt(1));
				out.println("Name : " + rs.getString(2));
				out.println("Authorname : " + rs.getString(3));
				out.println("Price : " + rs.getInt(4));
				out.println(" ");
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	

}
