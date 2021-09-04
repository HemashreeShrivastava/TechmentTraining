package com.techment;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveDemo2 {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernet.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
	    Query<StudentDto> query =	session.createQuery("select s.studentId,s.name,s.dept from Student s");
	    List results = query.list();
	    System.out.println(results);
		
		
		session.close();
		sessionFactory.close();
	
	}

}
