package com.newproject.statement.test.done;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.newproject.statement.test.jdbcutil.done.JDBCUtilNewProjectDone;

public class JDBCNewProjectCallableStatementDone
{

	public static void main(String[] args)
	{
		Connection conn = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		
		try 
		{
			conn = JDBCUtilNewProjectDone.getMySqlConnection();
			
			cstmt = conn.prepareCall("{call getAllEmployees4}");
			
			boolean isCallableExecuted = cstmt.execute();
			
			if(isCallableExecuted)
			{
				rs = cstmt.executeQuery();
				
				while(rs.next())
				{
					System.out.println("Emp_ID : "+rs.getInt(1)+" "+
									   "first_name : "+rs.getString(2)+" "+
									   "last_name : "+rs.getString(3)+" "+
									   "salary : "+rs.getInt(4));
				}
			}
			else
			{
				System.err.println("Error occured while executing Stored Procedure");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
