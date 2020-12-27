<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Info</title>
</head>
<body>

<center>
	<a href="UserList.jsp">View Users</a>
	<br>
	<br>
	<form action="SqlTag.jsp">
		Enter User Name : <input type="text" name="nm"><br><br>
		Enter Email Id : <input type="text" name="email"><br><br>
		<input type="submit" value="Save">
	</form>

</center>

</body>
</html>