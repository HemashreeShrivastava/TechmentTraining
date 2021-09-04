package com.OneToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OnetoManyClientDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Courses java = new Courses(90,"java",4);
		Courses Python = new Courses(91,"python",3);
		Courses bigData = new Courses(92,"Big data",4);
		List<Courses> course = new ArrayList<Courses>();
		course.add(java);
		course.add(Python);
		course.add(bigData);
		
		em.persist(java);
		em.persist(Python);
		em.persist(bigData);
		
		Student sachin = new Student();
		sachin.setId(1);
		sachin.setName("sachin");
		sachin.setCourses(course);
		
		em.persist(sachin);
		em.getTransaction().commit();  
		System.out.println("inserted");
		
		em.close();
		emf.close();



	}

}
