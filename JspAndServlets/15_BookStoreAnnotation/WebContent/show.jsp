<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>id</th>
		<th>isbn</th>
		<th>title</th>
		<th>author</th>
		<th>publish date</th>
		<th>price</th>
	</tr>
	<c:forEach var="book" items="${books}">
	
	<tr>
		<td>${book.id}</td>
		<td><c:out value="${book.isbn}"></c:out> </td>
		<td><c:out value="${book.title}"></c:out> </td>
		<td><c:out value="${book.author}"></c:out> </td>
		<td><c:out value="${book.pubDate}"></c:out> </td>
		<td><c:out value="${book.price}"></c:out> </td>
	</tr>
	</c:forEach>
</table>

<br>
<a href="bookController?action=addbook">add new customer</a>
</body>
</html>