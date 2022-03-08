package com.java8feature;

interface  Actor
{
	void Act();
	void fight();
	//if we want to add method body in interface we can make it default
	 default void Comedy()
	 {
		 System.out.println(" hero and villain can do comedy");
	 }
	
}
