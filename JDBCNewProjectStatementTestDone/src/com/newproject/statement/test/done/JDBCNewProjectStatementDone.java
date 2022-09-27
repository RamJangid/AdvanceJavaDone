package com.newproject.statement.test.done;

import java.sql.*;

public class JDBCNewProjectStatementDone 
{

	public static void main(String[] args) 
	{
		/*try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}*/
		
		try 
		{
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver Loaded");
			
		} 
		catch (SQLException e) 
		{
			System.out.println("SQlException, not class not found");
			e.printStackTrace();
		}
		
		try 
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee_details", "root", "password");
			System.out.println("Connection established");
			
			Statement stmt = conn.createStatement();// No query can be written in createStatement
			System.out.println("Statement is created");
			//Statement stmt = conn.createStatement(int resultSetType, int resultSetConcurrency);
			//Statement stmt = conn.createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability);
			
//			ResultSet rs1 = stmt.executeQuery("SHOW Databases");
			
//			while(rs1.next())
//			{
//				int i=1;
//				System.out.println(rs1.getString(i));
//				i++;
//			}
//			
//			rs1.close();
			
			//WORKED NICELY
//			
//			System.out.println("Query for SHOW datebases executed");
//			
//			ResultSet rs2 = stmt.executeQuery("SELECT *FROM employees");
//			
//			while(rs2.next())
//			{
//				System.out.println("Emp_ID : "+rs2.getInt(1)+" "+
//								   "first_name : "+rs2.getString(2)+" "+
//								   "last_name : "+rs2.getString(3)+" "+
//								   "salary : "+rs2.getInt(4));
//			}
//			
//			rs2.close();
			
			//WORKED NICELY
//			
//			boolean isTableCreated = stmt.execute("CREATE TABLE employee6(Emp_ID INT(10), first_name VARCHAR(20), last_name VARCHAR(20), salary INT(10))");
//			
//			int isTableCreated = stmt.executeUpdate("CREATE TABLE employee6(Emp_ID INT(10), first_name VARCHAR(20), last_name VARCHAR(20), salary INT(10))");
//			if(isTableCreated >0)
//			{
//				System.out.println("New Table is created "+isTableCreated);
//			}
//			else
//			{
//				System.err.println("Table not created, please recheck "+isTableCreated);
//			}
			
			//WORKED NICELY
			
			
//			boolean isDataInserted = stmt.execute("INSERT INTO employee4 VALUES(14, 'John','Cena ',100000)");
//			
//			if(isDataInserted == false)
//			{
//				System.out.println("New data is Inserted");
//			}
//			else
//			{
//				System.err.println("New data is not Inserted, please recheck");
//			}
			
			//WORKED NICELY
			
//			boolean isTableDeleted = stmt.execute("DROP TABLE employee6");
//			
//			if(isTableDeleted == false)
//				{
//					System.out.println("Table is deleted");
//				}
//				else
//				{
//					System.err.println("Table is not deleted, please recheck");
//				}
			
			//WORKED NICELY
			
//			boolean isAnyDataDeleted = stmt.execute("DELETE FROM employee4 WHERE Emp_ID = 14");
//			
//			if(isAnyDataDeleted == false)
//			{
//				System.out.println("Data is deleted");
//			}
//			else
//			{
//				System.err.println("Data is not deleted, please recheck");
//			}
			
			//WORKED NICELY
			
			boolean isDataUpdated = stmt.execute("UPDATE employee4 SET salary = 200000 WHERE Emp_ID = 11");
			
			if(isDataUpdated == false)
			{
				System.out.println("Data is Updated");
			}
			else
			{
				System.err.println("Data is not Updated, please recheck");
			}
			
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
