<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<body>
<center>
	<a href="SqlTag_UserData.jsp">Back</a>
	<br>
	<br>
	
	<s:setDataSource var="con" driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost:3306/todoapp" user="root" password="root"/>
	
	
	<s:query var="rs" dataSource="${con}" sql="select * from user"></s:query>

		<table border="2">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>
			</thead>
			<tbody>
				<core:forEach var="r" items="${rs.rows}">
					<tr>
						<td><core:out value="${r.id}"></core:out></td>
						<td><core:out value="${r.name}"></core:out></td>
						<td><core:out value="${r.email}"></core:out></td>
					</tr>
				</core:forEach>
			</tbody>
		</table>

	</center>

</body>
</html>