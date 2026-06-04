package mypack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

@WebServlet("/Viewserv")
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr = session.beginTransaction();
		
		Query<?> query=session.createQuery("from Register", Register.class);
		List<?> li = (List<?>) query.list();
		
		System.out.println(li);
		
		HttpSession se = request.getSession();
		se.setAttribute("Registerlist", li); 
		
		RequestDispatcher rd = request.getRequestDispatcher("ViewRegister.jsp");
		rd.forward(request, response);
		
		factory.close();
		
	}

}
