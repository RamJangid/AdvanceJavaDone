<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>

		<jsp:include page="Header.jsp">
			<jsp:param value="You are in error page" name="Header"/>
		</jsp:include>
		
		Error ${param.ERURL}
		<br>
		For any query, reach out to our customer support ${param.ERhelp}
		
		
		<jsp:include page="Footer.jsp">
			<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © Error™ Ltd. All rights reserved." name="Footer"/>
		</jsp:include>
		
</body>
</html>