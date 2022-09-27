<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show</title>
</head>
<body>
		Email from request : <%= request.getAttribute("reqEM")%>
		<br>
		Email from session : <%= session.getAttribute("ssnEM")%>
		<br>
		Email from Application : <%= application.getAttribute("conEM")%>
		<br>
		
		Name from request : <%= request.getAttribute("reqNM")%>
		<br>
		Name from session : <%= session.getAttribute("ssnNM")%>
		<br>
		Name from Application : <%= application.getAttribute("conNM")%>
		
</body>
</html>