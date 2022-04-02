package com.assoc.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee
{

	@Id
	@Column(name=" emp_id")
	private int empId;
	
	@Column(name="emp_Name")
	private String empName;
	
	@OneToOne
	private Manager manager;
	
	
public Employee(int empId, String empName, Manager manager) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.manager = manager;
	}
	public Employee() 
	{
		super();
	
	}

public int getEmpId() 
	{
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public String getEmpName() 
	{
		return empName;
	}

	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}

	public Manager getManager() 
	{
		return manager;
	}

	public void setManager(Manager manager) 
	{
		this.manager = manager;
	}
	

}
