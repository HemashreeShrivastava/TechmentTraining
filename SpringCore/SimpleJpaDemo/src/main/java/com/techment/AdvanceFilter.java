package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AdvanceFilter {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
	
		Query q1 = em.createQuery("select p from Pro  p where p.id between 70 and 105");  
	       
       
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
		
          Query q2 = em.createQuery("Select p from Pro  p where p.id IN(80,8001)");  
          
          @SuppressWarnings("unchecked")  
          List<Product> l2 =  (List<Product>)q2.getResultList();  
             
           System.out.println("IN Clause");  
           System.out.print("id");  
           System.out.print("\t name");  
           System.out.println("\tPrice");  
           System.out.println("\tCategory");  
             
            for(Product s:l2)  
            {  
            	System.out.print(s.getId());  
                System.out.print("\t"+s.getName());  
                System.out.println("\t"+s.getPrice());  
                System.out.println("\t"+s.getCategory());    
            }  
          
            Query q3 = em.createQuery("Select p from Pro p where p.name like '%_t'");  
            
            @SuppressWarnings("unchecked")  
            List<Product> l3 =  (List<Product>)q3.getResultList();  
              
             System.out.println("Like Clause");  
             System.out.print("id");  
             System.out.print("\t name");  
             System.out.println("\tPrice");  
             System.out.println("\tCategory");  
               
              for(Product s:l3)  
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
