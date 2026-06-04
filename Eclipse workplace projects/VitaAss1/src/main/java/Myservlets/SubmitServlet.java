package Myservlets;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypack.Mycon;


@WebServlet("/SubmitServlet")
public class SubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection con;
	
	@Resource(lookup="java:/comp/env/mypool")
	private DataSource ds;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		String name = request.getParameter("name");
		int Age = Integer.parseInt(request.getParameter("age"));
		String qualification = request.getParameter("qualification");
		
		String sql = "insert into Student values(?, ?, ?, ?)";
		

		try {
			con = ds.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, rollno);
			pstm.setString(2, name);
			pstm.setInt(3, Age);
			pstm.setString(4, qualification);
			
			PrintWriter out = response.getWriter();
			int k = pstm.executeUpdate();
			if(k>0) {
				out.println("Student Added Successfully..........");
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
