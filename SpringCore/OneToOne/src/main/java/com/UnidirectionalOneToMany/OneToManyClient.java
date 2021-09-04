package com.UnidirectionalOneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OneToManyClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Library library=new Library();
		library.setName("Shri sai");
		em.persist(library);
		Book book1 = new Book("Maths","AS",library);
		Book book2 = new Book("Science","xs",library);
		Book book3 = new Book("English","rty",library);
		em.persist(book1);
		em.persist(book2);
		em.persist(book3);
		Set<Book>books=new HashSet<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);	
		
		em.getTransaction().commit();
		em.close();
		emf.close();



	}

}
