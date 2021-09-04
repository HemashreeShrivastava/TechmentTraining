package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ManyToManyClientDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Course1 java = new Course1(100,"javaCore",4);
		Course1 python = new Course1(101,"python",5);
		Course1 db = new Course1(102,"database",2);
	    List <Course1> list =new ArrayList<Course1>();
	    list.add(db);
	    list.add(python);
	    list.add(java);
		em.persist(db);
		em.persist(python);
		em.persist(java);
		
			
		
		em.getTransaction().commit();  
		System.out.println("inserted");
		
		em.close();
		emf.close();



	}

}
