package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); //step-2
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Ramyasql@88");	//step-3
		
		Statement st=c.createStatement();	//step-4
		
		//String query="create table employee(emp_ID int(2) primary key, emp_Name varchar(20), emp_Salary int(2))";
	//insert operation
		String query1="insert into employee values(101,'Rohan Singh',30000)";	//step-5
		String query2="insert into employee values(102,'Meera Roy',40000)";
		String query3="insert into employee values(103,'John Smith',35000)";
		String query4="insert into employee values(104,'Robert Downey',28000)";
		String query5="insert into employee values(105,'Mary Smith',32000)";
	//delete operation	
		String query6="delete from employee where emp_ID=103";
	//update operation	
		String query7= "update employee set emp_Name='Chris Evans' where emp_ID=105";
		
		st.executeUpdate(query7);	//step-6
		
		//System.out.println("Table created successfully");
		//System.out.println("Inserted values in row successfully");
		//System.out.println("deleted second row");
		System.out.println("updated table employee");
		
		st.close();	//step-7
		c.close();

	}


}
