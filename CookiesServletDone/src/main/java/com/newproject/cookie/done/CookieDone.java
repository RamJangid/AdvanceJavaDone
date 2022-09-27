package com.newproject.cookie.done;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.io.IOException;


public class CookieDone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = (String)request.getParameter("email");
		Cookie cookies[] = request.getCookies();
		
		if(cookies!=null)
		{
			if(cookies.length!=0)
			{
				for(Cookie e : cookies)
				{
					String cookieName = e.getName();
					
					if(cookieName.equals("JSESSIONID"))
					{
						System.out.println("You are a new user");
					}
					else
					{
						System.out.println("You are an exisiting user");
					}
					
					String cookieValue = e.getValue();
					System.out.println("Cookie Value : "+cookieValue);
					
					String cookieDomain = e.getDomain();
					System.out.println("Cookie Domain : "+cookieDomain);
				}
			}
			else
			{
				System.out.println("Cookie not found");
			}
		}
		else
		{
			System.out.println("Cookie not found");
		}
		
		HttpSession session = request.getSession();
		
		if(session.isNew())
		{
			System.out.println("You are a new user with session");
		}
		else
		{
			System.out.println("You are an existing user with session");
		}
		
		Cookie c1 = new Cookie("Email", email);
		response.addCookie(c1);
		
		Cookie c2 = new Cookie("Phone", "7474747");
		response.addCookie(c2);
		
		RequestDispatcher rd = request.getRequestDispatcher("cookiedemo.jsp");
		rd.forward(request, response);

	}

}
