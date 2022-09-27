<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service</title>
</head>
<body>
		<h1>I am service</h1>
		
		<% 
		
		String partner = request.getParameter("deliverypartner");
		if(partner.equalsIgnoreCase("ZO"))
		{
				
		%>
		
		<jsp:forward page="zomato.jsp">
		
			<jsp:param value="https://www.zomato.com/" name="ZOURL"/>
			<jsp:param value="support@zomato.com" name="ZOhelp"/>
			
		</jsp:forward>
		
		<%
		}
		
		else if (partner.equalsIgnoreCase("SW"))
		{
			
		%>
		
		<jsp:forward page="swiggy.jsp">
		
			<jsp:param value="https://www.swiggy.com/" name="SWURL"/>
			<jsp:param value="support@swiggy.com" name="SWhelp"/>
			
		</jsp:forward>
		
		<%
		}
		
		else if (partner.equalsIgnoreCase("FA"))
		{
			
		%>
		
		<jsp:forward page="fasoos.jsp">
		
			<jsp:param value="https://www.fasoos.com/" name="FAURL"/>
			<jsp:param value="support@fasoos.com" name="FAhelp"/>
			
		</jsp:forward>
		
		<%
		}
		
		else if (partner.equalsIgnoreCase("UB"))
		{
			
		%>
		
		<jsp:forward page="ubereats.jsp">
		
			<jsp:param value="https://www.ubereats.com/" name="UBURL"/>
			<jsp:param value="support@ubereats.com" name="UBhelp"/>
			
		</jsp:forward>
		
		<%
		}
		
		else
		{
			
		%>
		
		<jsp:forward page="error.jsp">
		
			<jsp:param value="You have not selected any Restaurant" name="ERURL"/>
			<jsp:param value="support@error.com" name="ERhelp"/>
			
		</jsp:forward>
		
		<%	
		}
		%>

</body>
</html>