package com.prog;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Email = req.getParameter("email");
		String passwd = req.getParameter("passwd");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/newdb", "root", "Jishan@9136");
			
			String sql = "select * from User1 where email=? and passwd=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, Email);
			pstm.setString(2, passwd);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
				rd.forward(req, resp);
			}
			else {
				
				out.print("Sorry Email and Password Error ");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.include(req, resp);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
    
	
}
