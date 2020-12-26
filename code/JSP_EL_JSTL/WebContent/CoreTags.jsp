<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<core:set var="msg" value="ABC"></core:set>

<core:out value="Message : ${msg}"></core:out>

<br>

<core:forEach var="i" begin="1" end="10" step="1">
	<core:out value="${i}"></core:out>
	<br>
</core:forEach>
