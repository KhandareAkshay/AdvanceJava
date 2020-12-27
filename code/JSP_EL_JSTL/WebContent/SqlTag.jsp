<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<!-- 
1. Register Driver
2. Create Connection
3. Create Statement
4. execute statement
5. Close Connection 
-->

 
<s:setDataSource var="con" driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost:3306/todoapp" user="root" password="root"/>

<%-- 
<s:update dataSource="${con}" var="count" sql="insert into user values(0,'Xyz','xyz@gmail.com')">
</s:update> 
--%>

<s:update dataSource="${con}" var="count" sql="insert into user values(0,?,?)">
	<s:param value="${param.nm}"></s:param>
	<s:param value="${param.email}"></s:param>
</s:update>

<core:if test="${count>0}">
	<h3>Data inserted Successfully</h3>
</core:if>
	
	
	
