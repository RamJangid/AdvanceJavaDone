package com.myproject.jdbcutilnew.done;

import java.sql.*;


public class JDBCStatement 
{

	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
			conn = com.myproject.jdbcutil.done.JDBCUtil.getMySqlConnection();
			
			stmt = conn.createStatement();
			System.out.println("Statement is created in JDBCStatement class");
			
			rs = stmt.executeQuery("Select *from employees");
			
			while(rs.next())
			{
				System.out.println("Emp_ID : "+rs.getInt(1)+" "+
								   "first_name : "+rs.getString(2)+" "+
								   "last_name : "+rs.getString(3)+" "+
								   "salary : "+rs.getInt(4));
			}
			
			//stmt.executeQuery("CREATE TABLE employee4(Emp_ID INT(20), Name VARCHAR(10)"); Exception as executeQuery method return ResultSet always
			
			
			System.out.println("Close the Resources");
			
			com.myproject.jdbcutil.done.JDBCUtil.cleanup(rs, stmt, conn);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	}

}

