<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Details</title>
</head>
<body>
			<h1>Simplilearn Registeration Form</h1>
		
			<form action="bookflightbypayment.jsp" method = "post">
			
			First Name : <input type ="text" name = "firstName"/>
			<br><br>
			Last Name : <input type ="text" name = "lastName"/>
			<br><br>
			Email ID : <input type ="email" name ="emailId"/>
			<br><br>
			Phone : <input type ="long" name ="phone"/>
			<br><br>
			
			Gender : <input type ="radio" name = "gender" value = "Male"/>Male
					 <input type ="radio" name = "gender" value = "Female"/>Female
			<tr>
	
				<td colspan = 2 align = "center">
					<input type = "submit" value = "Register"/>
			</td>
	
	</tr>
		
		</form>
</body>
</html>