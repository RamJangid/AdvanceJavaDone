package com.newproject.done;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Date;


public class SessionServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = (String)request.getParameter("name");
		String email = (String)request.getParameter("email");
		
		HttpSession session = request.getSession();
		
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		
		System.out.println("Is New "+session.isNew());
		System.out.println("Session ID : "+session.getId());
		System.out.println("Session Creation Time "+new Date(session.getCreationTime()) );
		System.out.println("Session last access time "+session.getLastAccessedTime());
		
		ServletConfig sconfig = getServletConfig();
		ServletContext context = sconfig.getServletContext();
		
		//You can send email via 3 ways
		request.setAttribute("reqEM", email);
		session.setAttribute("ssnEM", email);
		context.setAttribute("conEM", email);
		
		request.setAttribute("reqNM", name);
		session.setAttribute("ssnNM", name);
		context.setAttribute("conNM", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
	}


}
