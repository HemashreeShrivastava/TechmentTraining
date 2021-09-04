package com.techment.Mapping;

import java.util.HashSet;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Set;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OneToManyClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		/*Book book1=new Book("English", (float) 100, null);
		Book book2=new Book("Maths", (float) 400, null);
		Book book3=new Book("GK", (float) 50, null);
		em.persist(book1);
		em.persist(book2);
		em.persist(book3);
		Set <Book> book=new HashSet<Book>();
		book.add(book1);
		book.add(book2);
		Set <Book> boo=new HashSet<Book>();
		boo.add(book1);
		boo.add(book3);
		
		Author author1 =new Author("XYZ", book);
		Author author2=new Author("abc", boo);
		
		em.persist(author2);
		em.persist(author1);*/
	     
		Query AllBook= em.createQuery("select distinct b from Book b");
		 List<Book> list =AllBook.getResultList();  
         System.out.println("ISBN \t"+" "+"Book name\t"+" "+"price\t");  
         for(Book s:list) {  
               
            System.out.println(+s.getISBN()+"\t"+" "+s.getName()+"\t"+" "+s.getPrice());  
         
              
        }  
		Query AllBooksBygivenAuthor =em.createQuery("select b.ISDN, a.id from Book b, Author a");
		em.getTransaction().commit();
		em.close();
		emf.close();



	}

}
