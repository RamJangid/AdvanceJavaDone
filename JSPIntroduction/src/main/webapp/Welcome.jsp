<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Done</title>
</head>
<body>
		<h1>Start JSP Declaration</h1>
		
		<h2>This is Java Code written in JSP</h2>
		
		<%!
			int a = 10;
			int b = 11;
			
			String course = "JSP Done";
			
			public int addNumber()
			{
				return a+b;
			}
			
			public String getCourse()
			{
				return "We are learning"+course;
			}
		%>
		
		<h1>End JSP Declaration</h1>
		
		<h1>Start JSP Calling</h1>
		
		<%
			out.print(a);
			out.print("<br>");
			out.print(b);
			out.print("<br>");
			out.print(course);
			out.print("<br>");
			out.print(addNumber());
			out.print("<br>");
			out.print(getCourse());
		
		%>
		
		<h1>**********Start JSP Calling Java Code using JSP Expression Tag**********</h1>
		
		<%= a %>
		<%= b %>
		<%= course %>
		<%= addNumber() %>
		<%= getCourse() %>
		
		<h1>**********End JSP Calling Java Code using JSP Expression Tag**********</h1>
</body>
</html>