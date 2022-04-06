package com.cg.shopping.service;

import com.cg.shopping.entities.Employee;
import com.cg.shopping.repository.IEmployeeRepositoryImpl;
import com.cg.shopping.repository.IEmployeeRepository;

public class IEmployeeServiceImpl implements IEmployeeService
{
	private IEmployeeRepository dao;
	
	//Step-1: Establishing connection between Service and Repo
	//constructor to connect interface of different package and implementation of different package 
	public IEmployeeServiceImpl() 
	{
		dao= new IEmployeeRepositoryImpl();
	}

	//Step-2: Service calls to perform CRUD operations
	@Override
	public Employee addEmployee(Employee employee) 
	{
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee)
	{
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee searchEmployeeById(int id)
	{
		Employee employee = dao.searchEmployeeById(id);
		return employee;
	
	}

	@Override
	public boolean deleteEmployee(int id)
	{
		dao.beginTransaction();
		dao.deleteEmployee(id);
		dao.commitTransaction();
		
		return false;
	}

}
