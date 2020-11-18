<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1>Sum value</h1>
<%
	
	int sum = (int)session.getAttribute("sum");
	out.print(sum + "<br>");
	session.removeAttribute("sum");

%>
</body>
</html>