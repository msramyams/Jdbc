package com.cg.shopping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	private int id;
	private String name;
	
	private String dob;
	
	private float Salary;
	private String address;
	private String designation;
	
	private int shop_id;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary)
	{
		Salary = salary;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getDesignation() 
	{
		return designation;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}

	public int getShop_id() 
	{
		return shop_id;
	}

	public void setShop_id(int shop_id) 
	{
		this.shop_id = shop_id;
	}
	

}
