package com.myproject.jdbc.done;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatement 
{

	public static void main(String[] args) 
	{
	
		System.out.println("Welcome to the New Project JDBC Done");
		
		//1. Load the Driver class by MYSQL to make connection to database
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		} 
		
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class Not found Exception handled");
		}
		
		//2. Get the Connection
		try 
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee_details","root","password");
			System.out.println("Connection is stablished");
			
			//3. Create the Statement
			Statement stmt = conn.createStatement();
			System.out.println("Statement created by Connection");
			
			//4. Prepare the query and Execute
			

			int numberOfRecordInserted = stmt.executeUpdate("INSERT INTO employees VALUES(146, 'brendon', 'Macculam', 1000000)");
			
			stmt.executeUpdate("UPDATE employees SET first_name = 'Brdn' WHERE Emp_ID = 51");
			
			stmt.executeUpdate("DELETE from employees WHERE Emp_ID = 142");
			
			if(numberOfRecordInserted>0)
			{
				System.out.println("Records are inserted : "+numberOfRecordInserted);
			}
			else
			{
				System.out.println("Records are not inserted : "+numberOfRecordInserted);
			}
			
			ResultSet rs = stmt.executeQuery("Select *from employees");
			
			
			
			
			while(rs.next())
			{
				System.out.println("Emp_ID : "+rs.getInt(1)+" "+
								   "first_name : "+rs.getString(2)+" "+
								   "last_name : "+rs.getString(3)+" "+
								   "salary : "+rs.getInt(4));
			}
			
			conn.close();
			stmt.close();
			rs.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("SQlException handled while getting connection");
		}
		
		
		
		
		

	}

}

