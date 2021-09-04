package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CLient {

	public static void main(String[] args) {
	
		  EntityManagerFactory emf = null;
		    EntityManager entityManager = null;
		    EntityTransaction transaction = null;
		    try {
		      emf = Persistence.createEntityManagerFactory("s");
		      entityManager = emf.createEntityManager();
		      transaction = entityManager.getTransaction();
		      transaction.begin();
		      Product product = new Product();
		      product.setId(111);
		      product.setName("cake ice cream");
		      product.setPrice(35);
		      product.setCategory("food item");
		      
		     
		      
		      entityManager.persist(product);
		      
		      Query q = entityManager.createQuery("select p from Pro p");
		      List<Product> resultList = q.getResultList();
		      System.out.println("num of product:" + resultList.size());
		      for (Product next : resultList) {
		        System.out.println("next product: " + next);
		      }
		      
		      /*Query q1=entityManager.createNamedQuery("delete from Pro p where p.getName =: name");
		      q1.setParameter("name", "Biscuit");
		      q1.executeUpdate();
		      List<Product> resultList1 = q1.getResultList();
		      System.out.println("num of product after deleting:" + resultList.size());
		      for (Product next : resultList) {
		        System.out.println("next product: " + next);
		      }*/
		      
		      Product p1=entityManager.find(Product.class,800);
		      entityManager.remove(p1);
		      
		      Product p2=entityManager.find(Product.class,80);
		      p2.setName("cake");
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
