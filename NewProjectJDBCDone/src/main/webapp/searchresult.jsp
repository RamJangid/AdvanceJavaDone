<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Data</title>
</head>
<body>
		<h1>Congratulations!!! Your search data is successful</h1>
		
		First Name : <%= request.getAttribute("FName") %>
		<br>
		Last Name : <%= request.getAttribute("LName") %>
		<br>
		Email Name : <%= request.getAttribute("Email") %>
		<br>
		Password Name : <%= request.getAttribute("Pass") %>
		<br>
</body>
</html>