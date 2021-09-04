package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BulkDataSimpleQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction();
		Query query = em.createQuery("select p from Pro p");
		List<Product> list =query.getResultList();
		System.out.println("id"+"\t "+"name"+"\t "+"category"+"\t "+"price");
		for(Product p : list)
		{
			System.out.println(p.getId()+" \t"+p.getName()+" \t"+p.getCategory()+"\t"+p.getPrice());
		}
		em.close();
		emf.close();

	}

}
