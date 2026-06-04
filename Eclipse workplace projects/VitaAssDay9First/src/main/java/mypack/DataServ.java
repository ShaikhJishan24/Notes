package mypack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

@WebServlet("/DataServ")
public class DataServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		String location = request.getParameter("loc");
		Query<?> query=session.createQuery("from Dept where loc=:str", Dept.class);
		query.setParameter("str", location);
		List<?> li = (List<?>) query.list();
		
		request.setAttribute("mylist", li);
		
		System.out.println(li);
		RequestDispatcher rd = request.getRequestDispatcher("Data.jsp");
		rd.forward(request, response);
	}

}
