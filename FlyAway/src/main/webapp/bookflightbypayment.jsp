<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book the Selected Flight by making Payment</title>
</head>
<body>
		<h1>These are the payment gateway, please pay the amount and confirm the booking</h1>
		
		<h2>Please select a payment gateway to make the payment</h2>
		
		<form action="finalbookingdetails.jsp" method = "post">
				<select name = "paymentgateway">
					<option value = "PhonePay">PhonePay</option>
					<option value = "Gpay">Gpay</option>
					<option value = "Paytm">Paytm</option>
				</select>
			
				<input type = "submit" name = "Pay"/>
				
				<br><br>	
		</form>		
</body>
</html>