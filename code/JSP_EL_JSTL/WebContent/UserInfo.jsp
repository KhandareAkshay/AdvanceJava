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

	${sessionScope.msg}
	
	<form action="Display.jsp">
		Enter First Name : <input name="fname"><br><br>
		Enter Middle Name : <input name="mname"><br><br>
		Enter Last Name : <input name="lname"><br><br>
		<input type="submit">
	</form>

</center>


</body>
</html>