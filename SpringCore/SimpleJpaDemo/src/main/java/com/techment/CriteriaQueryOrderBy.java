package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CriteriaQueryOrderBy {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
        CriteriaBuilder cb=em.getCriteriaBuilder();  
        CriteriaQuery<Product> cq=cb.createQuery(Product.class);  
          
       Root<Product>pro=cq.from(Product.class);  
         
       cq.orderBy(cb.asc(pro.get("price")));  
       CriteriaQuery<Product> select = cq.select(pro);  
       TypedQuery<Product> q = em.createQuery(select);  
       List<Product> list = q.getResultList();  


        System.out.print("id");  
           System.out.print("\t name");  
           System.out.println("\t price");  
          
        for(Product s:list)  
        {  
        System.out.print(s.getId());  
        System.out.print("\t"+s.getName());  
        System.out.println("\t"+s.getPrice());  
        }  

        
         
          
          
em.getTransaction().commit();  
        em.close();  
        emf.close();    


	}

}
