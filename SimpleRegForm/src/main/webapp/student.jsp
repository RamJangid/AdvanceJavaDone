<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registeratio Form</title>
</head>
<body>
		<h1>Simplilearn Registeration Form</h1>
		
		<form action="<%= request.getContextPath()%>/SimpleServlet" method="post">
		
		First Name : <input type ="text" name = "firstName"/>
		<br><br>
		Last Name : <input type ="text" name = "lastName"/>
		<br><br>
		Email ID : <input type ="email" name ="emailId"/>
		<br><br>
		Password : <input type ="password" name ="password"/>
		<br><br>
		
		Gender : <input type ="radio" name = "gender" value = "Male"/>Male
				 <input type ="radio" name = "gender" value = "Female"/>Female
	
		<br><br>
		
		<tr>
			<td>Timing</td>
				<td>
					<select name ="timing">
						<option value = "Select">Select</option>
						<option value = "1:00PM-2:00PM">1:00 PM - 2:00 PM</option>
						<option value = "4:00PM-5:00PM">4:00 PM - 5:00 PM</option>
						<option value = "5:00PM-7:00PM">5:00 PM - 7:00 PM</option>
						<option value = "7:00PM-10:00PM">7:00 PM - 10:00 PM</option>
					</select> 	
				</td>
		</tr>
		
		<br><br>
		
		<tr>
			<td>Course</td><br>
			
				<td>
					<input type ="checkbox" name = "course" value = "JAVA"/>JAVA<br>
					<input type ="checkbox" name = "course" value = "JDBC"/>JDBC<br>
					<input type ="checkbox" name = "course" value = "HIBERNATE"/>HIBERNATE<br>
					<input type ="checkbox" name = "course" value = "SPRING"/>SPRING<br>
					<input type ="checkbox" name = "course" value = "JSP"/>JSP<br>
				</td>
		</tr>
		
		<br><br>
		
		<tr>
			<td>Remarks</td>
				
				<td>
					<textarea name = "remarks" rows = "6" col = "20"></textarea>
				</td>
		</tr>
		
		<br><br>
		
		<tr>
	
			<td colspan = 2 align = "center">
				<input type = "submit" value = "Register"/>
			</td>
	
	</tr>
		
		</form>
	
</body>
</html>