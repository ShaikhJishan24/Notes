package mypack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Dao.StudentDAODataImpl;
import Dao.StudentDAOFileImpl;
import Dao.StudentDao;


public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String store = request.getParameter("store");

        
        Stud s = new Stud();
        s.setName(name);
        s.setAddress(address);

        StudentDao sdao;

        if ("file".equalsIgnoreCase(store)) {
            s.setRollno((int)(Math.random() * 1000));
            sdao = new StudentDAOFileImpl();
        } else {
            sdao = new StudentDAODataImpl();
        }

        sdao.addStudent(s);

        response.getWriter().println("Student added successfully!");
    }

}
