package com.myproject.jdbc.done;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTable 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		} 
		
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class Not found Exception handled");
		}
		
		try 
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee_details","root","password");
			System.out.println("Connection is stablished");
			
			Statement stmt = conn.createStatement();
			System.out.println("Statement created by Connection");
			
//			String query1 = "CREATE TABLE employee5(Emp_ID INT(10), Marks INT(10))";
//			
//			stmt.executeUpdate(query1);
			
			String query2 = "INSERT INTO employees VALUES(111, 'brendon', 'Macculam', 1000000)";
			
			stmt.executeUpdate(query2);
			
			System.out.println("New Table Created and data also Inserted in employees Table");
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("SQlException handled while getting connection");
		}

	}

}
