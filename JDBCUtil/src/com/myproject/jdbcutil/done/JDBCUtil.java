package com.myproject.jdbcutil.done;

import java.sql.*;

public class JDBCUtil 
{
		static  //static means use resources faster basis and execute with priority, No Main() method, static me static Err
		{
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded by JDBCUtil class");
			} 
			
			catch (ClassNotFoundException e) 
			{
				System.out.println("Class Not found Exception handled");
			}
		}
	
	//THERE IS NO LINK BETWEEN DRIVER LOADING AND CONNECTION, EVEN IF YOU DO NOT WRITE DRIVER LOADING CODE, NO COMPILE TIME ERROR
		
		public static Connection getMySqlConnection() throws SQLException
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee_details","root","password");
			System.out.println("Connection is stablished by JDBCUtil class");
			
			return conn;
		}
		
		
		public static void cleanup(ResultSet rs, Statement stmt, Connection conn) throws SQLException
		{
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		}


}
