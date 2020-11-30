<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customer">
	
	<table>
			<tr>
				<td><form:hidden path = "customerId"/></td>
			</tr>
			<tr>
				<td>Enter Name:</td>
				<td><form:input path="customerName" readonly="true"/></td>
			</tr>


			<tr>
				<td>Enter Birthday Day:</td>
				<td><form:input path="birthDay" readonly="true"/></td>
			</tr>

			<tr>
				<td>Enter Phone Number:</td>
				<td><form:input path="phoneNum" /></td>
			</tr>
			
			<tr>
				<td>Enter Address:</td>
				<td><form:input path="address" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="update customer" /></td>
			</tr>
		</table>
	
</form:form>
</body>
</html>