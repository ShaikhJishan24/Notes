package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		Student s1 = new Student("Sanket", 23, "Akola");
		session.persist(s1);
		
		Student s2 = new Student("Jishan", 24, "Bandra");
		session.persist(s2);
		
		tr.commit();
		System.out.println("Data inserted");

	}

}
