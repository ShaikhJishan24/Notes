package Demo;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
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
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection con;

	@Resource(lookup = "java:/comp/env/mypool")
	private DataSource ds;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		
		String sql = "select BookName from Book";
		try {
			con = ds.getConnection();
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			List<String> li = new ArrayList<>();
			
			while(rs.next()) {
				li.add(rs.getString(1));
			}
			
			request.setAttribute("mybookslist", li);
			
			RequestDispatcher rd = request.getRequestDispatcher("Servlet2") ;
			rd.forward(request, response);
		}
		catch(Exception e){
			
		}
	}
}

