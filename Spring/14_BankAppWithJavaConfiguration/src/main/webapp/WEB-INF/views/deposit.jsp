<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
    rel="stylesheet">
</head>
<body>
<br>
<h3>Deposit money</h3>
<h4><a href="app/home">Home</a></h4>
	<form:form action="withdraw" method="post" modelAttribute="depositBean">
		<table>
			
			<tr>
				<td>Enter account number:</td>
				<td><form:input path="accountId"/><form:errors path="accountId" class="error"></form:errors></td>
			</tr>
			
			<tr>
				<td>Enter amount to be transferred:</td>
				<td><input type="text" name="amount"><form:errors path="amount" class="error"></form:errors></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="deposit amount"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>