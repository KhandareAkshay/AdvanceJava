<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body>


<center>

	<h3>${param.msg}</h3>

	<form action="StudentRegisterController" method="post">
	
		Enter Name : <input type="text" name="name"><br><br>
		
		Enter Email : <input type="text" name="email"><br><br>
		
		Enter Password : <input type="password" name="password"><br><br>
		
		Enter Contact : <input type="text" name="contact"><br><br>
		
		<input type="submit" value="Save"><br><br>
	
		<a href="#"> | View Students |</a>
	
	</form>
</center>
</body>
</html>