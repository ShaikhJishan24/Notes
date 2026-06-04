package Myservlets;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

@WebServlet("/viewservlet")
public class viewserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Connection con;
	
	@Resource(lookup="java:/comp/env/mypool")
	private DataSource ds;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String sql = "select * from Register";
		try {
			con = ds.getConnection();
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			PrintWriter out = response.getWriter();
			
			while(rs.next()) {
				String name = rs.getString(1);
				String add = rs.getString(2);
				String email = rs.getString(3);
				String uname = rs.getString(4);
				int passwd = rs.getInt(5);
				
				out.println("Name : " + name + "<br>");
				out.println("Address : " + add + "<br>");
				out.println("email : "  + email + "<br>");
				out.println("Username : "  + uname + "<br>");
				out.println("password : "  + passwd + "<br>");
				out.println("</br>");
				
			}
			
		}
		catch(Exception e){
			
		}
	}

	

}
