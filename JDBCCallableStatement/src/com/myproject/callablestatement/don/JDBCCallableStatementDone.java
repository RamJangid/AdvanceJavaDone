package com.myproject.callablestatement.don;

import java.sql.*;

import com.myproject.util.done.JDBCUtil;

public class JDBCCallableStatementDone 
{
	public static void main(String[] args) 
	{
		System.out.println("JDBCCallableStatementDone Class");
		
		Connection con = null;
		ResultSet rs = null;
		
		try 
		{
			con = JDBCUtil.getMySqlConnection();
			
			PreparedStatement pstmt = con.prepareCall("{call getStoredProcedureForEmployee4}");
			
			boolean isExecuted = pstmt.execute();
			
			if(isExecuted == true)
			{
				 rs = pstmt.getResultSet();
				
				while(rs.next())
				{
//					System.out.println("Emp_ID : "+rs.getInt(1)+" "+
//									   "first_name : "+rs.getString(2)+" "+
//									   "last_name : "+rs.getString(3)+" "+
//									   "salary : "+rs.getInt(4));
					
					//You can use Column name instead of using Column number
					
					System.out.println("Emp_ID : "+rs.getInt("Emp_ID")+" "+
							   "first_name : "+rs.getString("first_name")+" "+
							   "last_name : "+rs.getString("last_name")+" "+
							   "salary : "+rs.getInt("salary"));
				}
			}
			else
			{
				System.err.println("Err occured while executing the stored procedure");
			}
			
			JDBCUtil.cleanup(rs, pstmt, con);
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
