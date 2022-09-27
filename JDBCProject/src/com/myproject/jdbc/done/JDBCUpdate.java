package com.myproject.jdbc.done;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class JDBCUpdate 
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
			
		
			
			String query = "UPDATE employees set first_name = ?, last_name = ? where Emp_ID =? ";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			System.out.println("PreparedStatement created by Connection");
			

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			try 
			{
				System.out.println("Enter name: ");
				String first_name = br.readLine();
				
				System.out.println("Enter last name");
				String last_name = br.readLine();
				
				System.out.println("Enter Emp_ID where you want to update");
				
				int emp_ID = Integer.parseInt(br.readLine());
				
				pstmt.setString(1, first_name);
				pstmt.setString(2, last_name);
				pstmt.setInt(3, emp_ID);
				
				pstmt.executeUpdate();
				System.out.println("Values Inserted");
				
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
			
		
			
		} 
		catch (SQLException e) 
		{
			System.out.println("SQlException handled while getting connection");
		}

	}

}