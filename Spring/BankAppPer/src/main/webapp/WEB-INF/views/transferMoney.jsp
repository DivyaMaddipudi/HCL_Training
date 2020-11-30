<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer Money</title>
</head>
<body>
<h3>Welcome user, ${sessionScope.accountNumber}</h3>
	<form:form action="transferMoney" method="post" modelAttribute="transactions">
		<table>
			<tr>
				<td><input type="hidden" name="fromaccount" value="${sessionScope.accountNumber}"> </td>
			</tr>
			<tr>
				<td>Enter to account number:</td>
				<td><form:input path="accountNumber"/> </td>
			</tr>
			
			<tr>
				<td>Enter amount to be transferred:</td>
				<td><input type="text" name="amount"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="transfer amount"></td>
			</tr>
			
		
		</table>
	
	</form:form>	
</body>
</html>