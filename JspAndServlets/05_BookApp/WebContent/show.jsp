<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<String> books = (List) request.getAttribute("bookNames");
	for(String book:books) {
		out.println(book);
	}
	request.removeAttribute("books");
%>	
</body>
</html>