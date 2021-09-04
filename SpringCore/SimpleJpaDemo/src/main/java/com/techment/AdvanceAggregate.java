package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AdvanceAggregate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
	
		Query q1 = em.createQuery("Select count(p) from Pro p");  
        System.out.println("Number of Product : "+q1.getSingleResult());  
             
        Query q2 = em.createQuery("Select MAX(p.price) from Pro p");  
        System.out.println("Maximum price : "+q2.getSingleResult());  
          
        Query q3 = em.createQuery("Select MIN(p.price) from Pro p");  
        System.out.println("Minimum price : "+q3.getSingleResult());
		
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();


	}

}
