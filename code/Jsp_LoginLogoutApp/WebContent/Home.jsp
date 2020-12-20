<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<center>
<div align="right">
	<span>You Signed in as, <b><%= session.getAttribute("email") %></b></span>
</div>
<hr>
	| <a href="Home.jsp">Home</a> | 
	 <a href="#">Profile</a> | 
	 <a href="#">Change Password</a> | 
	 <a href="Logout.jsp">Logout</a> | 
<hr>

</center>
</body>
</html>