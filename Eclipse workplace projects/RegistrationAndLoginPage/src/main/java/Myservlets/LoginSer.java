package Myservlets;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

@WebServlet("/loginservlet")
public class LoginSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection con;

	@Resource(lookup = "java:/comp/env/mypool")
	private DataSource ds;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

//		String username = request.getParameter("uname");
//		int  password = Integer.parseInt(request.getParameter("passwd"));
//		
//		String sql = "select * from Register";
//		try {
//			con = ds.getConnection();
//			
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(sql);
//			
//			boolean found = false;
//			
//			while(rs.next()) {
//				String uname = rs.getString("username");
//				int passwd = rs.getInt("passwd");
//				
//				if(username.equalsIgnoreCase(uname) && password == passwd) {
//					
//					found = true;
//					break;
//				}
//			}
//			
//			if(found) {
//				response.sendRedirect("success.html");
//			}
//			else {
//				response.sendRedirect("fail.html");
//			}	
//	}
//	catch(Exception e){
//		
//	}
		
		// or 
		String username = request.getParameter("uname");
		int password = Integer.parseInt(request.getParameter("passwd"));

		String sql = "select * from Register where username = ? and passwd = ?";

		try {
			con = ds.getConnection();

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, username);
			pstm.setInt(2, password);
			ResultSet rs = pstm.executeQuery();

			rs.next();

			if (username.equalsIgnoreCase(rs.getString("username")) && password == rs.getInt("passwd")) {
				response.sendRedirect("success.html");
			} else {
				response.sendRedirect("fail.html");
			}
		} catch (Exception e) {

		}

	}
}
