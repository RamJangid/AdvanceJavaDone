package com.newproject.done;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public StudentServlet() 
    {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("*************Begin doGet****************");
		
		String firstName = (String)request.getParameter("firstName");
		String lastName = (String)request.getParameter("lastName");
		String email = (String)request.getParameter("emailId");
		String password = (String)request.getParameter("password");
		
		System.out.println("firstName : "+firstName);
		System.out.println("lastName : "+lastName);
		System.out.println("email : "+email);
		System.out.println("password : "+password);
		
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		
		out.print("<h1>Hello, Interested in hiring from us</h1>");
		out.print("<h4>Okay, Form has been submitted successfully, Here's is your detail</h4>");
		
		out.print("<p>firstName "+firstName+"</p>");
		out.print("<p>lastName "+lastName+"</p>");
		out.print("<p>email "+email+"</p>");
		out.print("<p>password "+password+"</p>");
		
		out.print("</body></html>");
		
		out.close();
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("*************Finish doGet****************");
	}


}
