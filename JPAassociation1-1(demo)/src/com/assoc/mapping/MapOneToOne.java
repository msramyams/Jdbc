package com.assoc.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MapOneToOne 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//creating employee
		Employee e1= new Employee();
		//e1.setEmpId(1);
		e1.setEmpName("Nick");
		
		Employee e2= new Employee();
		e2.setEmpId(2);
		e2.setEmpName("John");
		
		
		//creating manager object
		Manager m1=new Manager();
		m1.setMgrId(101);
		m1.setMgrName("Ramya");
		
		Manager m2=new Manager();
		m2.setMgrId(102);
		m2.setMgrName("Mary");
		
		e1.setManager(m1);
		e2.setManager(m2);
	
	//persist only student, no need to persist Address explicitly
			//em.persist(e1);
			//em.persist(m1);
			em.persist(e2);
			em.persist(m2);
			em.getTransaction().commit();
				
			System.out.println("Added one student with address to database.");
			em.close();
			factory.close();
				
		
		
		

	}

}
