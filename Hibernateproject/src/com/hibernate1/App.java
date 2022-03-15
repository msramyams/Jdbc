package com.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Users;

	public class App 
	{

		public static void main(String[] args)
		{
			
			SessionFactory factory = new Configuration()
	                .configure("hibernate.cfg.xml")
	                .addAnnotatedClass(Users.class)
	                .buildSessionFactory();

	Session session = factory.getCurrentSession();

	try
	{
	// Create object of entity class type
	Users user = new Users( 2, "Tony","Stark","tony@gmail.com");
	// Start transaction
	session.beginTransaction();
	// Perform operation
	//session.save(user);
user=session.get(Users.class, 2);
//updating object
user.setUsers_lname("hemsworth");

	// Commit the transaction 
	session.getTransaction().commit();
	//System.out.println("user");
	System.out.println("user");


	} 
	finally
	{
	session.close();
	factory.close();
	}

	}
	}


