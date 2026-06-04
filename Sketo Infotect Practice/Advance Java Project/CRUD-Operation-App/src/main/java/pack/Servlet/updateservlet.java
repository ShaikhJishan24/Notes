package pack.Servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pack.Dao.UserDao;
import pack.User.User;

@WebServlet("/updateuser")
public class updateservlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("uname");
		String dob = req.getParameter("dob");
		String Address = req.getParameter("address");
		String qualification = req.getParameter("qualification");
		String Email = req.getParameter("email");
		int id = Integer.parseInt(req.getParameter("id"));
		
		// User se detail(input from user) servlet tak aya 
		User us = new User();
		us.setName(name);
		us.setDob(dob);
		us.setAddress(Address);
		us.setQalification(qualification);
		us.setEmail(Email);
		us.setId(id);
		
        int i = UserDao.UpdateUser(us);
		
		HttpSession session = req.getSession();
		
		if(i == 1) {
			session.setAttribute("succmsg", "Student Updated Successfully");
			resp.sendRedirect("index.jsp");
		}
		else {
			session.setAttribute("errormsg", "Something went wrong");
			resp.sendRedirect("index.jsp");
		}
		
		
		
		
		
		
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
