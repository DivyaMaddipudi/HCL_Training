<%@page import="com.demo.Dog"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" isThreadSafe="true" isErrorPage="false" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!private int counter = 0; %>
<%=counter++%>
<%
	Dog dog = null;
	out.print(dog.getDogName());
%>
</body>
</html>