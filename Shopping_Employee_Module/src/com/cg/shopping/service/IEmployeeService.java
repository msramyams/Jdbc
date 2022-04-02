package com.cg.shopping.service;
import com.cg.shopping.entities.Employee;
import com.cg.shopping.entities.*;

public interface IEmployeeService 
{
	
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployeeById(int id);
	public boolean deleteEmployee(int id);
	
	
	


}
