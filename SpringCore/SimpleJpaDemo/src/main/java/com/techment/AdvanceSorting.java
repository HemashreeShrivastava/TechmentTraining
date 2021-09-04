package com.techment;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AdvanceSorting {

	
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
				EntityManager em = emf.createEntityManager();
				em.getTransaction().begin();
			
				Query q1 = em.createQuery("Select p from Pro p order by p.price desc");  
			       
		       
		        List<Product> l1 =  (List<Product>)q1.getResultList();  
		           
		         System.out.println("Between Clause");  
		         System.out.print("id");  
		         System.out.print("\t name");  
		         System.out.println("\tPrice");  
		         System.out.println("\tCategory");  
		          for(Product s:l1)  
		          {  
		          System.out.print(s.getId());  
		          System.out.print("\t"+s.getName());  
		          System.out.println("\t"+s.getPrice());  
		          System.out.println("\t"+s.getCategory());  
		          
		          }  
				
		       				em.getTransaction().commit();
				em.close();
				emf.close();





	}

}
