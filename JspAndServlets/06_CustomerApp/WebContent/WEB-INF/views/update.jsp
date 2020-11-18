<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
</head>
<body>
<br>
${customer.address}
<br>
<form action="customercontroller.do" method="post">
<input type="hidden" name="id" value="${customer.id}" readonly>
	<table>
		<input type="hidden" name="id" value="${customer.id}" readonly>
		<tr>
			<td>Enter name:</td>
			<td><input type="text" name="name" value="${customer.name}" readonly></td>
		</tr>
		
		<tr>
			<td>Enter address:</td>
			<td><textarea name="address" rows="10" cols="30" value="${customer.address}"></textarea></td>
		</tr>	
		
		<tr>
			<td>Enter email:</td>
			<td><input type="text" name="email" value="${customer.email}"></td>
		</tr>
		
		<tr>
			<td>Enter phone:</td>
			<td><input type="text" name="phone" value="${customer.phone}"></td>
		</tr>
		
		<tr>
			<td>Enter dob:</td>
			<td><input type="text" name="dob" value="${customer.dob}" readonly></td>
		</tr>
		
		<tr>
			<td>Enter purchage capacity:</td>
			<td><input type="text" name="purchage_capacity" value="${customer.purchaseCapacity}" ></td>
		</tr>
		
		<tr>
			<td> <input type="submit" value="Update"> </td>
		</tr>

	</table>
</form>
</body>
</html>