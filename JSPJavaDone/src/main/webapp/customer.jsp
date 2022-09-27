<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customer.jsp</title>
</head>
<body>
		<jsp:useBean id="customer" class = "com.newproject.beans.done.Customer" scope = "session">
			<jsp:setProperty name = "customer" property = "cid" value = "111"/>
			<jsp:setProperty name = "customer" property = "cname" value = "Tony"/>
			<jsp:setProperty name = "customer" property = "email" value = "tony121@gmail.com"/>
			<jsp:setProperty name = "customer" property = "phone" value = "12345"/>
		
		</jsp:useBean>
		
		<h1>Using JSP get the Property</h1>
		
		<h2> CID: <jsp:getProperty name="customer" property="cid" /> </h2>
		<h2> Name: <jsp:getProperty name="customer" property="cname" /> </h2>
		<h2> Email: <jsp:getProperty name="customer" property="email" /> </h2>
		<h2> Phone: <jsp:getProperty name="customer" property="phone" /> </h2>
		
		<h1>Using JSP EL Expression get the Property</h1>
		
		<h2> CID: ${customer.cid}</h2>
		<h2> CID: ${customer.cname}</h2>
		<h2> CID: ${customer.email}</h2>
		<h2> CID: ${customer.phone}</h2>
		
		
		
</body>
</html>