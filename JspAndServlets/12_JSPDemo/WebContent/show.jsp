<%@page import="com.demo.Dog"%>
<%@page import="com.demo.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
Cities: <br>
${cities[0]}<br>
${cities["1"]}<br>

<br>
${applicationScope.email}<br>
${person.dog.dogName} <br>
</body>
</html>