package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CreteriaQuerySingleFetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb=em.getCriteriaBuilder();  
        CriteriaQuery<Product> cq=cb.createQuery(Product.class);  
          
       Root<Product> Pro=cq.from(Product.class);  
         
       cq.select(Pro.get("name"));   
         
        CriteriaQuery<Product> select = cq.select(Pro);  
        TypedQuery<Product> q = em.createQuery(select);  
        List<Product> list = q.getResultList();  

        System.out.println("id");  
             
          
        for(Product s:list)  
        {  
        System.out.println(s.getId());  
    
      }  
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
