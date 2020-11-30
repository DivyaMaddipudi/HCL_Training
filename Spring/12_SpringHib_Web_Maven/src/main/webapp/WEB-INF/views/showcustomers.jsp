<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Customers</title>
</head>
<body>
	<br>
	<form:form action="searchcustomer" method="get">
		<table>
			<tr>
				<td>Enter Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Enter Phone Number:</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td><input type="submit" value="search user"></td>
			</tr>
		</table>
	</form:form>
	<hr>
	<table>
		<tr>
			<th>Name</th>
			<th>BirthDay</th>
			<th>Phone Number</th>
			<th>Address</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${customers}" var="customer">
			<tr>
				<td>${customer.customerName}</td>
				<td>${customer.birthDay}</td>
				<td>${customer.phoneNum}</td>
				<td>${customer.address}</td>
				<td><a href="updatecustomer?id=${customer.customerId}">Update
						Book</a></td>
				<td><a href="deletecustomer?id=${customer.customerId}">Delete
						Book</a></td>
			</tr>
		</c:forEach>
	</table>

	<a href="addcustomer">Add Customer</a>
</body>
</html>