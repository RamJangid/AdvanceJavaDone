<%@page import = "com.newproject.beans.done.Customer" %>
<html>
<head>
<meta charset="UTF-8">
<title>display.jsp</title>
</head>
<body>
		<h1>I am display.jsp receiving data from insert.jsp</h1>
		
		<% 
		   Object obj1 = session.getAttribute("cst1key");
		
		   Customer c1 = null;	
		   
		   if(obj1!=null)
		   {
			   c1 = (Customer)obj1;
		   }
		   
		   Object obj2 = session.getAttribute("cst2key");
			
		   Customer c2 = null;	
		   
		   if(obj2!=null)
		   {
			   c2 = (Customer)obj2;
		   }
		
		%>
		
		<h1>Display the data in Java JSP from display.jsp</h1><br>
		
		<h2> Customer CID: <%= c1.getCid()%> </h2>
		<h2> Customer Name: <%= c1.getCname() %> </h2>
		<h2> Customer Email: <%= c1.getEmail() %> </h2>
		<h2> Customer Phone: <%= c1.getPhone() %> </h2><br>
		
		
		<h2> Customer CID: <%= c2.getCid()%> </h2>
		<h2> Customer Name: <%= c2.getCname() %> </h2>
		<h2> Customer Email: <%= c2.getEmail() %> </h2>
		<h2> Customer Phone: <%= c2.getPhone() %> </h2>
		
		
</body>
</html>