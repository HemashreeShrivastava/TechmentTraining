package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SimpleUpdateQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("update Pro set price=100 where id=103");
		query.executeUpdate();
	    em.getTransaction().commit();  
		Query qry =em.createQuery("select p from Pro p");
		List<Product> list =qry.getResultList();
		System.out.println("id"+"\t "+"name"+"\t "+"category"+"\t "+"price");
		for(Product p : list)
		{
			System.out.println(p.getId()+" \t"+p.getName()+" \t"+p.getCategory()+"\t"+p.getPrice());
		}
		em.close();
		emf.close();

	}

}
