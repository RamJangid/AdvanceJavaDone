<%@page import = "java.util.*" %>
<%@page import = "java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Flights</title>
</head>
<body>
		<h1>Here are the list of available Flights as per the entered details</h1>
		
		Date_Of_Travel : <%= request.getAttribute("D_Of_Trvl") %>
		<br>
		
		<% String Date_Of_Travel=(String)request.getAttribute("D_Of_Trvl");
		
			if(Date_Of_Travel.equalsIgnoreCase("21-09-2022"))
			{
		%>
		
		<h2>Below are available flights on the date <%= Date_Of_Travel %></h2>		
		
		<form action="register.jsp" method = "post">
				<select name = "selectanyflight">
					<option value = "AS">AirAsia</option>
					<option value = "IN">Indigo</option>
					<option value = "SP">SpiceJet</option>
				</select>
			
				<input type = "submit" name = "Submit"/>
				
				
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
				
				
				</form>
		<% 
			}
			
			
			else if(Date_Of_Travel.equalsIgnoreCase("23-09-2022"))
			{
		%>
		
		<h2>Below are available flights on the date <%= Date_Of_Travel %></h2>		
				<form action="register.jsp">
				<select name = "selectanyflight">
					<option value = "AS">AirAsia</option>
					<option value = "IN">Indigo</option>
				</select>
			
				<input type = "submit" name = "Submit"/>
				
				
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
				
				</form>
		<% 
			}
			else if(Date_Of_Travel.equalsIgnoreCase("25-09-2022"))
			{
		%>
		
		<h2>Below are available flights on the date <%= Date_Of_Travel %></h2>		
				<form action="register.jsp">
				<select name = "selectanyflight">
					<option value = "AS">AirAsia</option>
					<option value = "SP">SpiceJet</option>
				</select>
			
				<input type = "submit" name = "Submit"/>
				
				
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
				
				
				</form>
		<% 
		 
			}
			
			else
			{
				
		%>
		
		<h2>Please enter correct details</h2>	
		
		<% 	
				
			}
		%>	
		
		
</body>
</html>