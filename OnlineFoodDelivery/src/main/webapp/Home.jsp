<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

		<jsp:include page="Header.jsp">
			<jsp:param value="10 Best Instant Food Delivery Apps" name="Header"/>
		</jsp:include>
		
		

		<h2>Skip boring food and indulge in flavoursome Wraps, Meals and Bowls! Let's find out At Foodbox!</h2>
		
			<h3>Select a Food Delivery Partner</h3>
			
			<form action="service.jsp">
				<select name = "deliverypartner">
					<option value = "ZO">ZOMATO</option>
					<option value = "SW">SWIGGY</option>
					<option value = "FA">FASOOS</option>
					<option value = "UB">UBEREATS</option>
				</select>
			
				<input type = "submit" name = "Submit"/>
			
			</form>
		
		<jsp:include page="Footer.jsp">
			<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © Foodbox™ Ltd. All rights reserved." name="Footer"/>
		</jsp:include>
	
</body>
</html>