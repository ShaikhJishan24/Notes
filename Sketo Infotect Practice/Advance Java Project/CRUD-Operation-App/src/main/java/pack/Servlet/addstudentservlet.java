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

@WebServlet("/Useradd")
public class addstudentservlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("uname");
		String dob = req.getParameter("dob");
		String Address = req.getParameter("address");
		String qualification = req.getParameter("qualification");
		String Email = req.getParameter("email");
		
		// User se detail(input from user) servlet tak aya 
		User us = new User();
		us.setName(name);
		us.setDob(dob);
		us.setAddress(Address);
		us.setQalification(qualification);
		us.setEmail(Email);
		
		//  Now send data to User Dao(database)	
		int i = UserDao.addstudent(us);
		
		HttpSession session = req.getSession();
		
		if(i == 1) {
			session.setAttribute("succmsg", "Student Addedd Successfully");
			resp.sendRedirect("add_student.jsp");
		}
		else {
			session.setAttribute("errormsg", "Something went wrong");
			resp.sendRedirect("add_student.jsp");
		}
		
        // Alternative for above 		
//		int rowaffected = UserDao.addstudent(us);
//		
//		if(rowaffected == 1) {		
//			resp.sendRedirect("addUser-success.jsp");
//			// System.out.println("Data inserted successfully");
//		}
//		else {
//			resp.sendRedirect("addUser-error.jsp");
//			
//            // System.out.println("Something went wrong");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
