package com.techment.BookAuthor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Client {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		/*Author1 author=new Author1();
		author.setName("Hemashree");
		em.persist(author);
		Author1 author2=new Author1();
		author2.setName("Kaustubhi");
		em.persist(author2);
		Books book1 = new Books("me world",80,author2);
		Books book2 = new Books("GK",100,author2);
		Books book3 = new Books("EVS",200,author2);
		
		Set<Books>books=new HashSet<Books>();
		books.add(book1);
		books.add(book2);
		books.add(book3);	
		em.persist(book1);
		em.persist(book2);
		em.persist(book3); */
		
		 Query query = em.createQuery("select distinct b from Books b");  
         @SuppressWarnings("unchecked")  
       List<Books> list =query.getResultList();  
         System.out.println("ISBN"+"\t"+"name\t"+"price\t");  
         for(Books s:list) {  
               
            System.out.println(s.getISBN()+" "+s.getName()+" "+s.getPrice());  
         
              
         }  
         
         Query BookByAuthorName = em.createQuery("SELECT distinct b.ISBN, b.name, b.author,  a.id as authorId, a.name  FROM Books b JOIN Author1 a ON b.author = a.id");  
         @SuppressWarnings("unchecked")  
       List<Object[]> list2 =BookByAuthorName.getResultList(); 
       results.stream().forEach((record) -> {
    	       Book book = (Book)record[0];
    	       Author author = (Author)record[1];
    	 
        /* System.out.println("ISBN"+"\t"+"name\t"+"price\t");  
         for(Books s1:list2) {  
               
            System.out.println(s1.toString());  
         
              
         }  
           
		*/
		em.getTransaction().commit();
		em.close();
		emf.close();




	}

}
