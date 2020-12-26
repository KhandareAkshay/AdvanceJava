
<%
	String fName = request.getParameter("fname");
	String lName = request.getParameter("lname");
	
	if((fName==null || fName.isEmpty()) || (lName==null || lName.isEmpty()) ){
		//response.sendRedirect("UserInfo.jsp?msg=invalid Data provided...");
		session.setAttribute("msg", "Invalid Data Provided...");
		request.getRequestDispatcher("UserInfo.jsp").forward(request, response);
		
	}
		
%>



======By Epression Tag===============
<br>
Name = <%= request.getParameter("fname") +" " + request.getParameter("mname") +" " + request.getParameter("lname") %>

<hr>
======By Epression Language===============
<br>
Name = ${param.fname} ${param.mname} ${param.lname}
