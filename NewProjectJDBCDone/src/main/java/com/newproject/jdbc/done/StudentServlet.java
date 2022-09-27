package com.newproject.jdbc.done;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.myproject.jdbcutil.done.JDBCUtil;

@WebServlet("/")
public class StudentServlet extends HttpServlet 
{
	public static final String INSERT = "INSERT INTO STUDENT_PROJECT VALUES(?,?,?,?)";
	
	public static final String SEARCH_BY_EMAIL = "SELECT *FROM STUDENT_PROJECT WHERE STU_Email = ?";
	
	
	
	private static final long serialVersionUID = 1L;
       
 
    public StudentServlet() {
        super();
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("**************Start doPost()**************");
		String path = request.getServletPath();
		System.out.println("Path : "+path);
		
		switch(path)
		{
			case "/insert" :
			{
				saveData(request,response);
				break;
			}
			
			case "/getByEmail" :
			{
				getByEmailID(request,response);
				break;
			}
		}
		
		System.out.println("**************End doPost()**************");
	}
	

	public static void saveData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("**************Start saveData()**************");
		Connection conn = null;
		String firstName = (String)request.getParameter("firstName");
		String lastName = (String)request.getParameter("lastName");
		String emailId = (String)request.getParameter("emailId");
		String password = (String)request.getParameter("password");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(emailId);
		System.out.println(password);
		
		
		try 
		{
			conn = JDBCUtil.getMySqlConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(INSERT);
			
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, emailId);
			pstmt.setString(4, password);
			
			pstmt.execute();
			
			System.out.println("Records are Inserted Successfully");
		
			System.out.println("Closing the Resources");
			
			conn.close();
			pstmt.close();
				
			
		} 
		catch (SQLException e) 
		{
			System.err.println("Records are not updated due to this Error");
			e.printStackTrace();
		}
		
		display(request,response);
		System.out.println("**************End saveData()**************");
	}
	
	
	
	
	private void getByEmailID(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("**************Start getByEmailID()**************");
		
		Connection conn = null;
		
		String emailId = (String)request.getParameter("emailId");
		System.out.println(emailId);
		
		try 
		{
			conn = JDBCUtil.getMySqlConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(SEARCH_BY_EMAIL);
			
			
			pstmt.setString(1, emailId);
			
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				String firstName = rs.getString("STU_FirstName");
				String lastName = rs.getString("STU_LastName");
				String email = rs.getString("STU_Email");
				String password = rs.getString("STU_Password");
				
				System.out.println("firstName : "+firstName);
				System.out.println("lastName : "+lastName);
				System.out.println("email : "+email);
				System.out.println("password : "+password);
				
				displaySearchResult(firstName,lastName,email,password,request,response);
			}
			
			System.out.println("Records are searched Successfully");
		
			System.out.println("Closing the Resources");
			
			conn.close();
			pstmt.close();
				
			
		} 
		catch (SQLException e) 
		{
			System.err.println("Records are not updated due to this Error");
			e.printStackTrace();
		}
		
		System.out.println("**************End getByEmailID()**************");
		
	}
	
	
	
	
	private void displaySearchResult(String firstName, String lastName, String email, String password,
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setAttribute("FName", firstName);
		request.setAttribute("LName", lastName);
		request.setAttribute("Email", email);
		request.setAttribute("Pass", password);
		
		RequestDispatcher rd = request.getRequestDispatcher("searchresult.jsp");
		rd.forward(request, response);
		
	}

	public static void display(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("**************Start display()**************");

		String firstName = (String)request.getParameter("firstName");
		String lastName = (String)request.getParameter("lastName");
		String emailId = (String)request.getParameter("emailId");
		String password = (String)request.getParameter("password");
		
		request.setAttribute("FName", firstName);
		request.setAttribute("LName", lastName);
		request.setAttribute("Email", emailId);
		request.setAttribute("Pass", password);
		
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
		System.out.println("**************End display()**************");
	}

}
