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
		Student student=new Student();
		
		
		//transient state
		student.setStudentId(4);
		student.setName("Naveen");
		student.setDept("Developer");
		
		session.persist(student);
		System.out.println("Inserted");
		//jar file jab add kia h tab ka error h wo xml file ko read karne k liua koi jar search hi kr paa rha h isilia class not found exception aarha h 
//		ek bar jar ko fir se ad krke dekhana shayuad kuch chut gaya ho  
		tx.commit();
	}

}
