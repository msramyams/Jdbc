package com.cg.shopping.repository;
import com.cg.shopping.entities.Employee;
public interface IEmployeeRepository 
{
	
	public  Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployeeById(int id);
	public boolean deleteEmployee(int id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
