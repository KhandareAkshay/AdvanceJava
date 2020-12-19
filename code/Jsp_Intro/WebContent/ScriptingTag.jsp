<!-- 
// age = 20; 
// 1 - 17 : Teen age
// 18 - 60 : Adult Age
//61 - 110 : Old Age -->


<%
int age = 20; 

if(age >= 1 && age <= 17)
{
%>
	<%= ("Teen Age") %>
<%	
}
else if(age >= 18 && age <= 60)
{
%>
	<%= ("Adult Age") %>
<%
}
else if(age >= 61 && age <= 110)
{
%>
	<%= ("Old Age") %>
<%
}
%>



