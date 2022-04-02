package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
	    EntityManager em=factory.createEntityManager();
	    
	    em.getTransaction().begin();
	    
	    Student st=new Student();
	    st.setName("ramya");
	    
	    Student st1=new Student();
	    st1.setName("John");
		
		Address ad1=new Address();
		ad1.setStreet("third");
		ad1.setState("Karnataka");
		ad1.setCity("Bangalore");
		st.setAddress(ad1);
		
		Address ad2=new Address();
		ad2.setStreet("Second");
		ad2.setState("Andhra Pradesh");
		ad2.setCity("Hyderabad");
		st1.setAddress(ad2);
		
		em.persist(st);
		em.persist(st1);
		em.getTransaction().commit();
		
		System.out.println("successfully added in database");
		em.close();
		factory.close();
	}

}
