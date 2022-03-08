package com.java8feature;

public class Villain implements Actor
{
	public void Act()
	{
		System.out.println(" villian can act");
	}
	public void fight()
	{
		System.out.println("villian can fight");
	}
	

	public static void main(String[] args)
	{
		Hero h=new Hero();
		h.Act();
		h.fight();
	System.out.println("----------------");
		
		Villain v=new Villain();
		v.Act();
		v.fight();
		System.out.println("-----------");
		v.Comedy();
		

	}

}
