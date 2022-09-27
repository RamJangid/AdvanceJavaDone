package com.newproject.statement.test.done;

import java.sql.*;

import com.newproject.statement.test.jdbcutil.done.JDBCUtilNewProjectDone;

public class JDBCNewProjectPreparedStatementDone 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try 
		{
			conn = JDBCUtilNewProjectDone.getMySqlConnection();
			
			//PreparedStatement conn.prepareStatement();//ERR, Query must be written
			
			
//			pstmt = conn.prepareStatement("SHOW databases");//Query must needed in advance
//			
//			rs = pstmt.executeQuery();
//			
//			
//			
//			while(rs.next())
//			{
//				int i=1;
//				System.out.println(rs.getString(i));
//				i++;
//			}
			
			//This worked nicely done
			
//			System.out.println("SHOW databases query worked with prepareStatement also");
//			
//			pstmt = conn.prepareStatement("Select *from employees");
//			
//			rs = pstmt.executeQuery();
//			
//			while(rs.next())
//			{
//				System.out.println("Emp_ID : "+rs.getInt(1)+" "+
//								   "first_name : "+rs.getString(2)+" "+
//								   "last_name : "+rs.getString(3)+" "+
//								   "salary : "+rs.getInt(4));
//			}
			
			//System.out.println("SELECT *FROM employees query worked with prepareStatement also");
			
			
//			pstmt = conn.prepareStatement("CREATE TABLE employee6(Emp_ID INT(10), first_name VARCHAR(20), last_name VARCHAR(20), salary INT(10))");
//			
//			boolean isTableCreated = pstmt.execute();
//			
//			if(isTableCreated == false)
//			{
//				System.out.println("New Table is created "+!isTableCreated);
//			}
//			else
//			{
//				System.err.println("New Table is not created, please recheck "+!isTableCreated);
//			}
//			
//			
//			
//			pstmt = conn.prepareStatement("INSERT INTO employee4 VALUES(21, 'Mark','Wood',100000)");
//			
//			boolean isDataInserted = pstmt.execute();
//			
//			if(isDataInserted == false)
//			{
//				System.out.println("New data is Inserted");
//			}
//			else
//			{
//				System.err.println("New data is not Inserted, please recheck");
//			}
//			
//			pstmt = conn.prepareStatement("DROP TABLE employee6");
//			
//			boolean isTableDeleted = pstmt.execute();
//			
//			if(isTableDeleted == false)
//				{
//					System.out.println("Table is deleted");
//				}
//				else
//				{
//					System.err.println("Table is not deleted, please recheck");
//				}
//			
//			//WORKED NICELY
//			
//			pstmt = conn.prepareStatement("DELETE FROM employee4 WHERE Emp_ID = 14");
//			
//			boolean isAnyDataDeleted = pstmt.execute();
//			
//			if(isAnyDataDeleted == false)
//			{
//				System.out.println("Data is deleted");
//			}
//			else
//			{
//				System.err.println("Data is not deleted, please recheck");
//			}
//			
//			//WORKED NICELY
//			
//			
//			pstmt = conn.prepareStatement("UPDATE employee4 SET salary = 200001 WHERE Emp_ID = 11");
//			
//			boolean isDataUpdated = pstmt.execute();
//			
//			if(isDataUpdated == false)
//			{
//				System.out.println("Data is Updated");
//			}
//			else
//			{
//				System.err.println("Data is not Updated, please recheck");
//			}
			
			
			
			
			pstmt = conn.prepareStatement("INSERT INTO employee4 VALUES(?,?,?,?)");
			
//			pstmt.setString(1, "Emp_ID"); //Don't write 
//			pstmt.setInt(1, 23);
//			
//			pstmt.setString(2, "first_name");
//			pstmt.setString(2, "Johny");
//			
//			pstmt.setString(3, "last_name");
//			pstmt.setString(3, "Wrestling");
//			
//			pstmt.setString(4, "salary");
//			pstmt.setInt(4, 500000);
			
			
			
//			pstmt.setInt(1, 23);
//			pstmt.setString(2, "Johny");
//			pstmt.setString(3, "Wrestling");
//			pstmt.setInt(4, 500000);
//			
//			pstmt.execute();
//			
//			pstmt.setInt(1, 25);
//			pstmt.setString(2, "Triple");
//			pstmt.setString(3, "H");
//			pstmt.setInt(4, 500001);
//			
//			pstmt.execute();
//			
//			pstmt.setInt(1, 14);
//			pstmt.setString(2, "Carrion");
//			pstmt.setString(3, "Cross");
//			pstmt.setInt(4, 500002);
//			
//			pstmt.execute();
			
			
			//pstmt.executeUpdate();//Last stmt Row will be executed twice if we call execute and executeUpdate both
			
			pstmt = conn.prepareStatement("UPDATE employee4 SET first_name = ? WHERE Emp_ID = ?");
			
			pstmt.setString(1, "Game");
			pstmt.setInt(2, 25);
			
			pstmt.executeUpdate();
			
			
			JDBCUtilNewProjectDone.cleanUpResources(conn, pstmt, rs);
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		
	}

}

