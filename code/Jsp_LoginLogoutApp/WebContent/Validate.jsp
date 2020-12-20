<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%
	String email = request.getParameter("email");
	String password = request.getParameter("pass");

	try {

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb", "root",
				"root");
		PreparedStatement pstm = connection
				.prepareStatement("select * from users where email=? and password=?");
		pstm.setString(1, email);
		pstm.setString(2, password);

		ResultSet rs = pstm.executeQuery();

		if (rs.next()) {
			//valid user
			int id = rs.getInt("id");
			String contact = rs.getString("contact");
			String status = rs.getString("status");

			if ("active".equalsIgnoreCase(status)) {
				session.setAttribute("id", id);
				session.setAttribute("email", email);
				session.setAttribute("contact", contact);
				session.setAttribute("status", status);
				response.sendRedirect("Home.jsp");
			}else{
				response.sendRedirect("Login.jsp?code=3");
			}

		} else {
			//invalid user
			response.sendRedirect("Login.jsp?code=2");
		}

		connection.close();

	} catch (Exception e) {
		e.printStackTrace();
	}
%>