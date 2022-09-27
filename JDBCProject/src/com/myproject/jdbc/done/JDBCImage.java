package com.myproject.jdbc.done;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class JDBCImage 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		} 
		
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class Not found Exception handled");
		}
		
		try 
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee_details","root","password");
			System.out.println("Connection is stablished");
			
			//Statement stmt = conn.createStatement();
			
			String query = "INSERT INTO employee3(Image) VALUES(?)";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			System.out.println("PreparedStatement created by Connection");
			
			
			try 
			{
				FileInputStream fis = new FileInputStream("C:\\Users\\91820\\Music\\FullStackDeveloper\\Image.jpg");
				
				try 
				{
					pstmt.setBinaryStream(1, fis, fis.available());
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			
			
			pstmt.executeUpdate();
			System.out.println("Values Inserted");
			
		} 
		catch (SQLException e) 
		{
			System.out.println("SQlException handled while getting connection");
		}

	}

}

