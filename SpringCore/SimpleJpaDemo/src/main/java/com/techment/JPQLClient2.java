package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLClient2 {

	public static void main(String[] args) {
	
		  EntityManagerFactory emf = null;
		    EntityManager entityManager = null;
		    EntityTransaction transaction = null;
		    try {
		      emf = Persistence.createEntityManagerFactory("s");
		      entityManager = emf.createEntityManager();
		      transaction = entityManager.getTransaction();
		      //transaction.begin();
		      		      
		      Query query = entityManager.createQuery("select p from Pro p ");
		      List<Product> product = query.getResultList();
		      for(Product p: product)
		      {
		    	  System.out.println(p.getId());
		      }
		      Query q1 =entityManager.createNamedQuery("findAllProduct");
		      List <Product> l1=q1.getResultList();
		      for(Product p: l1)
		      {
		    	  System.out.println(p.getId()+" "+p.getName());
		      }
		      transaction.commit();
		    } catch (Exception e) {
		      System.out.println(e);
		      transaction.rollback();
		    } finally {
		      entityManager.close();
		      emf.close();
		    }
	}

}
