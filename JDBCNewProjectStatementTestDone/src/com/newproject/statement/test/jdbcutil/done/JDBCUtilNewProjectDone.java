package com.newproject.statement.test.jdbcutil.done;

import java.sql.*;

public class JDBCUtilNewProjectDone 
{
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public static Connection getMySqlConnection() throws SQLException
	{
		
		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee_details", "root", "password");
			System.out.println("Connection established by JDBCUtil class");
			
			return conn;
	}
	
	public static void cleanUpResources(Connection conn, Statement stmt) throws SQLException
	{
		if(conn!=null)
			conn.close();
		
		if(stmt!=null)
			stmt.close();
		
	}
	
	public static void cleanUpResources(Connection conn, Statement stmt, ResultSet rs) throws SQLException
	{
		if(conn!=null)
			conn.close();
		
		if(stmt!=null)
			stmt.close();
		
		if(rs!=null)
			rs.close();
		
	}

}
