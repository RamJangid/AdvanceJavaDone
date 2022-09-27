package com.myproject.jdbc.done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class JDBCPreparedStatement 
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
			
			String query = "INSERT INTO employee2(First_Name, City) VALUES(?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			System.out.println("PreparedStatement created by Connection");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			try 
			{
				System.out.println("Enter name: ");
				String name = br.readLine();
				
				System.out.println("Enter city");
				String city = br.readLine();
				
				pstmt.setString(1, name);
				pstmt.setString(2, city);
				
				pstmt.executeUpdate();
				System.out.println("Values Inserted");
				
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
			
			
			//You can also enter values with Scanner class objects
			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter name: ");
//			String emp_name = sc.nextLine();
//			
//			System.out.println("Enter city");
//			String emp_city = sc.nextLine();
//			
//			pstmt.setString(1, emp_name);
//			pstmt.setString(2, emp_city);
			
			
		
			
		} 
		catch (SQLException e) 
		{
			System.out.println("SQlException handled while getting connection");
		}

	}

}
