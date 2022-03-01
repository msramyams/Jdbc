package jdbc_sample;
/*
 * Step-1: import package
 * Step-2: Load and register
 * Step-3: Establish connection
 * Step-4: Create Statement
 * Step-5: Execute query
 * Step-6: Process query
 * Step-7: Close
 */
import java.sql.*;	//step-1
public class Student_Database
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); //step-2
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Ramyasql@88");	//step-3
		
		Statement st=c.createStatement();	//step-4
		
		//String query="create table student(sID int(2) primary key, sName varchar(20), sMarks int(2))";
	//insert operation
		String query1="insert into student values(1,'ramya',30)";	//step-5
		String query2="insert into student values(2,'Jack',40)";
		String query3="insert into student values(3,'Mike',35)";
		String query4="insert into student values(4,'Nick',28)";
		String query5="insert into student values(5,'Mary',32)";
	//delete operation	
		String query6="delete from student where sid=3";
	//update operation	
		String query7= "update student set sName='meera' where sID=2";
		
		st.executeUpdate(query7);	//step-6
		
		//System.out.println("Table created successfully");
		//System.out.println("Inserted values in fifth row successfully");
		//System.out.println("deleted second row");
		System.out.println("updated table student");
		
		st.close();	//step-7
		c.close();

	}

}
