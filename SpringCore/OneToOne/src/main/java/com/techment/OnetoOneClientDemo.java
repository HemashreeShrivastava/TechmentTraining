package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OnetoOneClientDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Address address=new Address();
		address.setDoorNo(1001);
		address.setStreetName("BTM");
		address.setCity("Bangalore");
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("mahesh");
		employee.setDesignation("hr");
		employee.setAddress(address);
		em.persist(address);
		em.persist(employee);
		System.out.println("======Inserted======");
		
		
		em.getTransaction().commit();  
		
		em.close();
		emf.close();



	}

}
