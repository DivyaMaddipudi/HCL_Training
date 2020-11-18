<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.customerapp.model.Customer" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer App</title>
</head>
<body>

<br>

Hi ${sessionScope.user.username}, Welcome back!


<br>
<a href="logout">Logout</a>
<br>

<table>
	<tr>
		<th>Id</th>
		<th>name</th>
		<th>address</th>
		<th>email</th>
		<th>phone</th>
		<th>dob</th>
		<th>purchaseCapacity</th>
		
		<c:if test="${sessionScope.user.profile == 'admin'  || user.profile == 'mgr'}">
		<th>Update</th>
		</c:if>
		<c:if test="${sessionScope.user.profile == 'admin'}">
		<th>Delete</th>
		</c:if>
	</tr>
	
	<c:forEach items="${customers}" var="customer">
			<tr>
				<td>${customer.id}</td>
				<td>${customer.name }</td>
				<td>${customer.address }</td>
				<td>${customer.email }</td>
				<td>${customer.phone }</td>
				<td>${customer.dob }</td>
				<td>${customer.purchaseCapacity}</td>
				<c:if test="${sessionScope.user.profile == 'admin' || user.profile == 'mgr'}">
				<td><a href="customercontroller.do?action=updatecustomer&id=${customer.id}">Update</a> </td>
				</c:if>
				<c:if test="${sessionScope.user.profile == 'admin'}">
				<td><a href="customercontroller.do?action=deletecustomer&id=${customer.id}">Delete</a> </td>
				</c:if>
			</tr>
	</c:forEach>
</table>
<br>
<c:if test="${sessionScope.user.profile == 'admin' || user.profile == 'mgr'}">
<a href="customercontroller.do?action=addcustomer">add new customer</a>
</c:if>
</body>
</html>