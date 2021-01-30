<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create new Task</title>
</head>
<body>

<center>
	<h3>Add New Task</h3>
	
	<span>${param.msg}</span><br>
	
	<form action="create-my-task">
		Enter Task Title <input type="text" name="title"><br><br>
		Enter Task Desc <input type="text" name="detail"><br><br>
		Enter Task date <input type="date" name="taskdate"><br><br>
		<input type="submit" value="Create New">
	</form>
</center>


</body>
</html>