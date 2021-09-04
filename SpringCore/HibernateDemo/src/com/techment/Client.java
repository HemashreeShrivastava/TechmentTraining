package com.techment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure("hibernet.cfg.xml");
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Hemashree");
		employee.setDept("Developer");
		
		session.persist(employee);
		System.out.println("Inserted");
		tx.commit();
	}

}