package com.newproject.statement.test.done;

import com.newproject.statement.test.jdbcutil.done.JDBCUtilNewProjectDone;

import java.sql.*;

public class JDBCNewProjectJDBCUtilDone 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try 
		{
			conn = JDBCUtilNewProjectDone.getMySqlConnection();
			
			stmt = conn.createStatement();// No query can be written in createStatement
			System.out.println("Statement is created");
			
			rs = stmt.executeQuery("SELECT *FROM employees");
			
			while(rs.next())
			{
				System.out.println("Emp_ID : "+rs.getInt(1)+" "+
								   "first_name : "+rs.getString(2)+" "+
								   "last_name : "+rs.getString(3)+" "+
								   "salary : "+rs.getInt(4));
			}
			
			System.out.println("Closing the Resources");
			
			JDBCUtilNewProjectDone.cleanUpResources(conn, stmt, rs);
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		
	}

}
