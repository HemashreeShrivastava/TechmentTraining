package com.techment;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SimpleStaticQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction();
		Query query = em.createNamedQuery("findName");
		List<String> list =query.getResultList();
		for(String p : list)
		{
			System.out.println(p);
		}
		em.close();
		emf.close();
	}

}



