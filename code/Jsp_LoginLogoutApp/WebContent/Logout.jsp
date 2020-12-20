<%
	session.invalidate();
	response.sendRedirect("Login.jsp?code=4");
%>