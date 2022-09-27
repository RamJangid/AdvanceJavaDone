<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fasoos</title>
</head>
<body>

		<jsp:include page="Header.jsp">
			<jsp:param value="Fasoos!!! Every Meal Matters" name="Header"/>
		</jsp:include>


		<h1>Welcome to the Fasoos</h1>
		<h2>Discover the best food & drinks in to your Home</h2>
		
		Click on the URL to redirect our portal ${param.FAURL}
		<br>
		For any query, reach out to our customer support ${param.FAhelp}
		
		
		<jsp:include page="Footer.jsp">
			<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © Fasoos™ Ltd. All rights reserved." name="Footer"/>
		</jsp:include>
		
</body>
</html>