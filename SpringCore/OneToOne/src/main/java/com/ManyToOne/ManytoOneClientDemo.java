package com.ManyToOne;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ManytoOneClientDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Course java = new Course(90,"java",4);
		
	
		
		em.persist(java);
			
		Students sachin = new Students();
		sachin.setId(1);
		sachin.setName("sachin");
		sachin.setCourses(java);
		Students sina = new Students();
		sachin.setId(2);
		sachin.setName("sina");
		sachin.setCourses(java);
		
		em.persist(sachin);
		em.getTransaction().commit();  
		System.out.println("inserted");
		
		em.close();
		emf.close();



	}

}
