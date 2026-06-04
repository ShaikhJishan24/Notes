package Dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mypack.Stud;

public class StudentDAODataImpl implements StudentDao {

	 private SessionFactory factory;

	    public StudentDAODataImpl() {
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        factory = cfg.buildSessionFactory();
	    }

	    @Override
	    public void addStudent(Stud s) {

	        Session session = factory.openSession();
	        Transaction tr = session.beginTransaction();

	        session.persist(s);

	        tr.commit();
	        session.close();
	    }

}
