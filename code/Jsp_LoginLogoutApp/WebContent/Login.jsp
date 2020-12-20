<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<center>
		<h3>User Login</h3>
		<hr>

		<%
			String msg = "";
			String msgColor = "";
			String code = request.getParameter("code");
			if (code != null) {
				switch (code) {
					case "1":
						msg = "Success..";
						msgColor = "green";
						break;
					case "2":
						msg = "Invalid User Name or password..";
						msgColor = "red";
						break;
					case "3":
						msg = "Your account is Inactive.. Please Contact Admin..";
						msgColor = "red";
						break;
					case "4":
						msg = "You have been logged out successfully";
						msgColor = "green";
						break;
				}
			}
		%>

		<font color="<%=msgColor%>"><h4><%=msg%></h4></font>

		<form action="Validate.jsp" method="post">
			Enter User Name : <input type="email" name="email"
				placeholder="Enter your email id"> <br> <br> Enter
			Password : <input type="password" name="pass"
				placeholder="Enter your password"> <br> <br> <input
				type="submit" value="Login"> <input type="reset"
				value="Reset">
		</form>
		<br> <br> <a href="#">Forgot Password?</a> || <a href="#">Not
			Yet Register?</a>
	</center>

</body>
</html>