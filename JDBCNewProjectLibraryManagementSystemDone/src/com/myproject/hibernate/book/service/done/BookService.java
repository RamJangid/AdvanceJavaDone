package com.myproject.hibernate.book.service.done;

import java.sql.*;

import com.myproject.hibernate.lms.book.done.Book;
import com.myproject.jdbcutil.lms.done.JDBCUtil;

public class BookService 
{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public String verifyUsers(String user, String passowrd) 
	{
		System.out.println("**********Start verifyUsers()**********");
		
		String verifyUser ="";
		
		try 
		{
			conn = JDBCUtil.getMySqlConnection();
			
			pstmt = conn.prepareStatement("Select *from USER WHERE USER_NAME = ? and USER_PASS = ?");
			
			pstmt.setString(1, user);
			pstmt.setString(2, passowrd);
			
			rs = pstmt.executeQuery();//If and only execute USER_NAME = 'Tony' and USER_PASS = 'password'"
			//Resultset rs will not have any record in it if given user name and password are not matched
			
			if(rs.next())
			{
				//System.out.println("User Logged Successfully");
				verifyUser = "User Logged Successfully";
			}
			else
			{
				//System.err.println("User name and/or password are not matched");
				verifyUser = "User name and/or password are not matched";
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			try 
			{
				JDBCUtil.cleanup(rs, pstmt, conn);
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("**********End verifyUsers()**********");
		return verifyUser;
		
	}

	
	public int addBook(Book book) 
	{
		System.out.println("**********Start addBook()**********");
		
		int numberOfRecordsUpdated = 0;
		
		try
		{
			
			conn = JDBCUtil.getMySqlConnection();
			
			pstmt = conn.prepareStatement("INSERT INTO BOOKS VALUES(?,?,?,?,?,?)");
			
			pstmt.setInt(1, book.getBookid());
			pstmt.setString(2, book.getBookname());
			pstmt.setString(3, book.getBookauthor());
			pstmt.setString(4, book.getBookpublication());
			pstmt.setInt(5, book.getBookprice());
			pstmt.setInt(6, book.getBookisbn());
			
			numberOfRecordsUpdated = pstmt.executeUpdate();
			
			
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		finally
		{
			try 
			{
				JDBCUtil.cleanup(rs, pstmt, conn);
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("**********End addBook()**********");
		
		return numberOfRecordsUpdated;
		
		
	}


	public String getBookByID(int bookID) 
	{
		String byBookIDReturnBOOK_NAME = "";
		System.out.println("**********Start getBookByID()**********");
		
		try
		{
			conn = JDBCUtil.getMySqlConnection();
			
			pstmt = conn.prepareStatement("SELECT BOOK_NAME FROM BOOKS WHERE BOOK_ID = ?");
			
			pstmt.setInt(1, bookID);
			
			rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				byBookIDReturnBOOK_NAME = rs.getString("BOOK_NAME");
			}
			else
			{
				byBookIDReturnBOOK_NAME = "";
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		finally
		{
			try 
			{
				JDBCUtil.cleanup(rs, pstmt, conn);
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		
		System.out.println("**********End getBookByID()**********");
		return byBookIDReturnBOOK_NAME;
	}
	

}
