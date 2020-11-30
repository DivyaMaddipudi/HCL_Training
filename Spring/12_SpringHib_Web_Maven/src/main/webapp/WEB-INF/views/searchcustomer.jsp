<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Customer</title>
</head>
<body>
	<br>
	<h3>Customer Details</h3>
	<table>
		<tr>
			<th>Name</th>
			<th>BirthDay</th>
			<th>Phone Number</th>
			<th>Address</th>
			<th>Update</th>
		</tr>

		<tr>
			<td>${customerByNameAndPhone.customerName}</td>
			<td>${customerByNameAndPhone.birthDay}</td>
			<td>${customerByNameAndPhone.phoneNum}</td>
			<td>${customerByNameAndPhone.address}</td>
			<td><a href="updatecustomer?id=${customerByNameAndPhone.customerId}">Update Book</a></td>
		</tr>
	</table>
</body>
</html>