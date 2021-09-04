package com.techment.OneToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OnetoManyClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee1 e1 =new Employee1("hema", "developer");
		Employee1 e2 =new Employee1("manoj","hr");
		//to store in db
		em.persist(e1);
		em.persist(e2);
		//to store all employee in list
		List<Employee1> employees=new ArrayList<Employee1>();
		employees.add(e2);
		employees.add(e1);
		Department department =new Department();
		department.setName("hr");
		department.setEmployee(employees);
		em.persist(department);
		em.getTransaction().commit();

		em.close();
		emf.close();



	}

}
