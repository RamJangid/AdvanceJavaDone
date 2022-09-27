package com.simplilearn.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Hello")
public class Hello extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body><h4>Hello, this is Done in Hello Servlet</h4></body></html>");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
