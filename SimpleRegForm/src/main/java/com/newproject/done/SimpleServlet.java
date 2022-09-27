package com.newproject.done;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SimpleServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		System.out.println("*************Begin doPost****************");
		
		String firstName = (String)request.getParameter("firstName");
		String lastName = (String)request.getParameter("lastName");
		String email = (String)request.getParameter("emailId");
		String password = (String)request.getParameter("password");
		
		String gender = (String)request.getParameter("gender");
		
		String timing = (String)request.getParameter("timing");
		
		String course[] = request.getParameterValues("course");
		
		String remarks = (String)request.getParameter("remarks");
		
		System.out.println("firstName : "+firstName);
		System.out.println("lastName : "+lastName);
		System.out.println("email : "+email);
		System.out.println("password : "+password);
		
		System.out.println("gender : "+gender);
		System.out.println("timing : "+timing);
		
		for(String e : course)
		{
			System.out.println("Course : "+e);
		}
		
		System.out.println("remarks : "+remarks);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		
		out.print("<h1>Hello, Interested in hiring from us</h1>");
		out.print("<h4>Okay, Form has been submitted successfully, Here's is your detail</h4>");
		
		out.print("<p>firstName "+firstName+"</p>");
		out.print("<p>lastName "+lastName+"</p>");
		out.print("<p>email "+email+"</p>");
		out.print("<p>password "+password+"</p>");
		
		out.print("<p>gender "+gender+"</p>");
		out.print("<p>timing "+timing+"</p>");
		
		out.print("<p>remarks "+remarks+"</p>");
		
		out.print("</body></html>");
		
		
		out.close();
		
		
		
		System.out.println("*************Begin doPost****************");
		
		//doGet(request, response);
	}

}
