package com.techment.curd;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class CRUDCLient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Authors aut1=new Authors("mina","kumari","sahu",7895662);
		Authors aut2=new Authors("munira","b","ali",1235662);
		Authors aut3=new Authors("ram","kumar","basu",7895662);
		Authors aut4=new Authors("mina","gautam","sahu",7895442);
		Authors aut5=new Authors("B","ayaya","shrinivas",5595662);
		em.persist(aut1);
		em.persist(aut2);
		em.persist(aut3);
        em.persist(aut4);
        em.persist(aut5);
        em.getTransaction().commit();
		Query select= em.createQuery("select a from Authors a");
		 List<Authors> list =select.getResultList();  
        System.out.println("Id \t"+" "+"First name\t"+" "+"Middle name\t"+" "+"Last name\t"+" "+"Mobile No.\t");  
        for(Authors s:list) {  
              
           System.out.println(+s.getAuthorId()+"\t"+" "+s.getFirstName()+"\t"+" "+s.getMiddleName()+"\t "+" "+s.getLastName()+"\t"+" "+s.getPhoneNo());  
        
          }  
        Authors s=em.find(Authors.class,5);  
        System.out.println("Before Updation");  
        System.out.println(" id = "+s.getAuthorId());  
        System.out.println("firt Name = "+s.getFirstName());  
        System.out.println("middle name = "+s.getMiddleName());
        System.out.println("last name = "+s.getLastName());
        System.out.println("phone no = "+s.getPhoneNo());
          
s.setPhoneNo(3053256);  
          
        System.out.println("After Updation");  
        System.out.println(" id = "+s.getAuthorId());  
        System.out.println("firt Name = "+s.getFirstName());  
        System.out.println("middle name = "+s.getMiddleName());
        System.out.println("last name = "+s.getLastName());
        System.out.println("phone no = "+s.getPhoneNo());	
        
        
       
      
       Authors del =em.find(Authors.class,4);  
       em.remove(del);  
       em.getTransaction().commit();
       System.out.println("the element gets deleted");
       
       System.out.println("to find element whose id is 3");
       Authors find1 =em.find(Authors.class,3); 
       System.out.println(" id = "+find1.getAuthorId());  
       System.out.println("firt Name = "+find1.getFirstName());  
       System.out.println("middle name = "+find1.getMiddleName());
       System.out.println("last name = "+find1.getLastName());
       System.out.println("phone no = "+find1.getPhoneNo());	
       
       em.close();
	   emf.close();
	   
	   

	}

}
