package com.myproject.preparedstatement.don;

import java.sql.*;

public class JDBCPreparedStmtDone 
{

	public static void main(String[] args) 
	{
		Connection conn = null;
		
		try 
		{
			conn = JDBCUtil.getMySqlConnection();
			
//			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO employees VALUES(?,?,?,?)");
//			
//			pstmt.setInt(1, 121);
//			pstmt.setString(2,"Chris");
//			pstmt.setString(3, "Gayle");
//			pstmt.setInt(4, 200001);
//			
//			pstmt.execute();
//			
//			pstmt.setInt(1, 122);
//			pstmt.setString(2,"Jack");
//			pstmt.setString(3, "Hagger");
//			pstmt.setInt(4, 200002);
//			
//			pstmt.execute();
//			
//			pstmt.setInt(1, 123);
//			pstmt.setString(2,"Chris");
//			pstmt.setString(3, "Jericho");
//			pstmt.setInt(4, 200003);
//			
//			pstmt.execute();
			
//			
//			PreparedStatement pstmt = conn.prepareStatement("UPDATE employees SET first_name = ? WHERE Emp_ID = ?");
//			
//			pstmt.setString(1, "The");
//			pstmt.setInt(2, 123);
//			
//			pstmt.execute();
//			
//			System.out.println("Records Updated Successfully");
			
			PreparedStatement pstmt = conn.prepareStatement("DELETE FROM employees WHERE Emp_ID = ?");
			
			pstmt.setInt(1, 123);
			
			pstmt.execute();
			
			System.out.println("Records are deleted Successfully");
		
			System.out.println("Closing the Resources");
			
			conn.close();
			pstmt.close();
				
			
		} 
		catch (SQLException e) 
		{
			System.err.println("Records are not updated due to this Error");
			e.printStackTrace();
		}

	}

}
