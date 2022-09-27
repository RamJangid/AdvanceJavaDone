package com.myproject.jdbc.concurrency.done;

import java.sql.*;

import com.myproject.concurrency.jdbcutil.done.JDBCUtil;

public class JDBCConcurrency 
{

	public static void main(String[] args) 
	{
		try 
		{
			Connection conn = JDBCUtil.getMySqlConnection();
			
			//Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = stmt.executeQuery("Select *from employees");
			
			
			System.out.println("Before Updating just printing the data");
			while(rs.next())
			{
				System.out.println("Emp_ID : "+rs.getInt(1)+" "+
								   "first_name : "+rs.getString(2)+" "+
								   "last_name : "+rs.getString(3)+" "+
								   "salary : "+rs.getInt(4));
			}
			
			//The while loop rs is stopped and got no entry to print so to move control from again from beginning use
			
			rs.beforeFirst();
			
			while(rs.next())
			{
				int Emp_ID_Updated = rs.getInt("Emp_ID")+21;
				
				rs.updateInt("Emp_ID", Emp_ID_Updated);
				
				rs.updateRow();//without this, you can see updated values are not showing so must use this
			}
			
			System.out.println("After Updating");
			
			rs.beforeFirst();
			
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
