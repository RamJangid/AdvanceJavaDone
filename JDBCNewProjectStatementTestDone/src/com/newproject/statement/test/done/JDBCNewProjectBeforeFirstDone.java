package com.newproject.statement.test.done;

import java.sql.*;

import com.newproject.statement.test.jdbcutil.done.JDBCUtilNewProjectDone;

public class JDBCNewProjectBeforeFirstDone 
{
	public static void main(String[] args)
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try 
		{
			conn = JDBCUtilNewProjectDone.getMySqlConnection();
			
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			rs = stmt.executeQuery("Select *from employees");
			
			System.out.println("Before updating values");
					
			while(rs.next())
			{
				System.out.println("Emp_ID : "+rs.getInt(1)+" "+
							 	   "first_name : "+rs.getString(2)+" "+
								   "last_name : "+rs.getString(3)+" "+
								   "salary : "+rs.getInt(4));
			}	
				
			rs.beforeFirst();
			
			while(rs.next())
			{
				int Emp_ID_Updated = rs.getInt("Emp_ID") + 21;
				
				rs.updateInt("Emp_ID", Emp_ID_Updated);
				
				rs.updateRow();
			}
			
			rs.beforeFirst();
			
			System.out.println("After updating values");
			
			while(rs.next())
			{
				System.out.println("Emp_ID : "+rs.getInt(1)+" "+
							 	   "first_name : "+rs.getString(2)+" "+
								   "last_name : "+rs.getString(3)+" "+
								   "salary : "+rs.getInt(4));
			}	
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
