<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<core:set var="msg" value="ABC"></core:set>

<core:out value="Message : ${msg}"></core:out>

<br>

<core:forEach var="i" begin="1" end="10" step="1">
	<core:out value="${i}"></core:out>
	<br>
</core:forEach>

<core:set var="empName" value="abc,xyz,lmn,pqr,stu,pst"></core:set>
<br>
<core:out value="Names : ${empName}"></core:out>
<br>

<core:forEach var="n" items="${empName}">
	<core:out value="${n}"></core:out>
	<br>
</core:forEach>
<br>
<core:if test="${10>100}">
	<core:out value="Hello"></core:out>
</core:if>

<core:catch var="ex">
	<%= 10/0 %>
</core:catch>

<core:out value="${ex}"></core:out>

<%-- <core:redirect url="https://www.google.com"></core:redirect> --%>

<br>
<core:set var="code" value="4"></core:set>
<core:choose>
	<core:when test="${code==1}">
			<font color="green">Success</font>
	</core:when>
	<core:when test="${code==2}">
			<font color="red">Invalid User Name or password..</font>
	</core:when>
	<core:when test="${code==3}">
			<font color="red">Your account is Inactive.. Please Contact Admin..</font>
	</core:when>
	<core:when test="${code==4}">
			<font color="green">Successfully Logged out</font>
	</core:when>
</core:choose>





