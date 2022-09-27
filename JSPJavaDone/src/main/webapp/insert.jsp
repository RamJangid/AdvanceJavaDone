<%@page import = "com.newproject.beans.done.Customer" %>
<html>
<head>
<meta charset="UTF-8">
<title>insert.jsp</title>
</head>
<body>
		<%
			Customer cst1 = new Customer();
			cst1.setCid(111);
			cst1.setCname("Tony");
			cst1.setEmail("tony121@gmail.com");
			cst1.setPhone(12345);
			
			session.setAttribute("cst1key", cst1);
		
			Customer cst2 = new Customer();
			cst2.setCid(121);
			cst2.setCname("Triple");
			cst2.setEmail("triple@gmail.com");
			cst2.setPhone(1212147);
			
			session.setAttribute("cst2key", cst2);
			
		%>
		
		<jsp:forward page="display.jsp"/>
		

</body>
</html>