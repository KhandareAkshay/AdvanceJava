<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">

	function add(){
		var n1 = document.getElementById("num1").value;
		var n2 = document.getElementById("num2").value;
		document.getElementById("output").innerHTML = parseInt(n1)+parseInt(n2);
	}

</script>
</head>
<body>
	
	
	Enter 1st Num : <input type="text" id="num1"><br>
	Enter 2nd Num : <input type="text" id="num2" onchange="add()"><br>
	Addition Is : <label id="output"></label>
	
</body>
</html>