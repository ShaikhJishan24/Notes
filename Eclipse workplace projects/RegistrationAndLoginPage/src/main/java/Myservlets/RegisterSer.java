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
import java.sql.PreparedStatement;

import javax.sql.DataSource;

@WebServlet("/registerservlet")
public class RegisterSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection con;
	
	@Resource(lookup="java:/comp/env/mypool")
	private DataSource ds;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		int passwd = Integer.parseInt(request.getParameter("passwd"));
		
		String sql = "insert into Register values(?, ?, ?, ?, ?)";
		
		try {
			con = ds.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setString(2, address);
			pstm.setString(3, email);
			pstm.setString(4, username);
			pstm.setInt(5, passwd);
			
			PrintWriter out = response.getWriter();
			int k = pstm.executeUpdate();
			if(k>0) {
				out.println("User Added Successfully..........");
			}
			else {
				out.println("Something went wrong...");
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
