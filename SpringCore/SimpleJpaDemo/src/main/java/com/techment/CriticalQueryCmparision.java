package com.techment;

public class CriticalQueryCmparision {

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
         EntityManager em = emf.createEntityManager();  
         em.getTransaction().begin( );  
           
         CriteriaBuilder cb=em.getCriteriaBuilder();  
           
         AbstractQuery<StudentEntity> cq1=cb.createQuery(StudentEntity.class);  
         AbstractQuery<StudentEntity> cq2=cb.createQuery(StudentEntity.class);  
           
        Root<StudentEntity> stud1=cq1.from(StudentEntity.class);  
          
       cq1.where(cb.greaterThan(stud1.get("s_age"), 22));  
         
         CriteriaQuery<StudentEntity> select1 = ((CriteriaQuery<StudentEntity>) cq1).select(stud1);  
         TypedQuery<StudentEntity> tq1 = em.createQuery(select1);  
         List<StudentEntity> list1 = tq1.getResultList();  
           
         System.out.println("Students having age greater than 22");  
           
         System.out.print("s_id");  
            System.out.print("\t s_name");  
            System.out.println("\t s_age");  
           
         for(StudentEntity s:list1)  
         {  
         System.out.print(s.getS_id());  
         System.out.print("\t"+s.getS_name());  
         System.out.println("\t"+s.getS_age());  
         }  
           
         Root<StudentEntity> stud2=cq2.from(StudentEntity.class);  
              
             
           cq2.where(cb.lessThan(stud2.get("s_age"), 22));  
             
             CriteriaQuery<StudentEntity> select2 = ((CriteriaQuery<StudentEntity>) cq2).select(stud2);  
             TypedQuery<StudentEntity> tq2 = em.createQuery(select2);  
             List<StudentEntity> list2 = tq2.getResultList();  
 
             System.out.println("Students having age Less than 22");  
               
             System.out.print("s_id");  
                System.out.print("\t s_name");  
                System.out.println("\t s_age");  
               
             for(StudentEntity s:list2)  
             {  
             System.out.print(s.getS_id());  
             System.out.print("\t"+s.getS_name());  
             System.out.println("\t"+s.getS_age());  
             }  
           
em.getTransaction().commit();  
         em.close();  
         emf.close();    

	}

}
