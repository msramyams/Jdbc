package com.cg.shopping.client;

import com.cg.shopping.entities.Employee;

import com.cg.shopping.service.IEmployeeService;
import com.cg.shopping.service.IEmployeeServiceImpl;


public class Client 
{
	public static void main(String[] args)
	{
	
	
	//CRUD operation  of employees
	Employee employee = new Employee();
	IEmployeeService service= new IEmployeeServiceImpl();
	
		//Create Operation 1
			employee.setId(1);
			employee.setName("Ramya");
			employee.setDob("08-04-1987");
			employee.setSalary(4500);
			employee.setAddress("London");
			employee.setDesignation("Sales");
			//System.out.println("Added  employee to database.");
			
		//Create Operation2
			//at this breakpoint, we have added one record to table
			employee.setId(2);
			employee.setName("Mark");
			employee.setDob("03-05-1989");
			employee.setSalary(5500);
			employee.setAddress("London");
			employee.setDesignation("Manager");
			//System.out.println("added employee: "+ employee.getId()+" "+employee.getName()+" "+employee.getDob()+" "+employee.getSalary()+" "+employee.getAddress()
			//+" "+employee.getDesignation());
			//service.addEmployee(employee);
			
		//Create Operation 3
			employee.setId(3);
			employee.setName("Tony");
			employee.setDob("02-06-1990");
			employee.setSalary(3500);
			employee.setAddress("USA");
			employee.setDesignation("Cashier");
			System.out.println("Added  employee to database.");
			//service.addEmployee(employee);
			
			
		// Retrieve Operation
			employee = service.searchEmployeeById(1);
			//System.out.print("ID:"+employee.getId());
			//System.out.println(" Name:"+employee.getName());
			
			
		// Update Operation
			//at this breakpoint, we have updated record added in first section
			employee = service.searchEmployeeById(1);
			employee.setAddress("India");
			service.updateEmployee(employee);
			//System.out.println("Updated address of employee with Id: "+employee.getId());
			
		//Delete Operation
			//at this breakpoint, record is removed from table
			employee= service.searchEmployeeById(3);
			System.out.print("ID:"+employee.getId());
			System.out.println(" Name:"+employee.getName()); 
			service.deleteEmployee(3);
			
			
			
			
			
			
			
			
			
	
	
	
	
	
	
	
	
}
}
