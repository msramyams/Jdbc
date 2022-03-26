package com.cg.jpacurd.client;
 import com.cg.jpacurd.entities.Student;
import com.cg.jpacurd.service.StudentService;
import com.cg.jpacurd.service.StudentServiceImpl; 


public class Client
{
	public static void main(String[] args) 
	{
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		
		// Create Operation
//		student.setStudentId(1);
//		student.setName("ramya");
//		service.addStudent(student);
		
		//Create Operation2
		student.setStudentId(3);
		student.setName("ramya");
		service.addStudent(student);
		System.out.println("added student3: "+student.getName()+student.getStudentId());
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
//		student = service.findStudentById(1);
//		System.out.print("ID:"+student.getStudentId());
//		System.out.println(" Name:"+student.getName()); 
		
		// Update Operation
//		student = service.findStudentById(1);
//		student.setName("ramya-ms");
//		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
//		student = service.findStudentById(1);
//		System.out.print("ID:"+student.getStudentId());
//		System.out.println(" Name:"+student.getName()); 
		
		//at this breakpoint, record is removed from table
		// Delete Operation
		student = service.findStudentById(3);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed..."); 
		}
}



