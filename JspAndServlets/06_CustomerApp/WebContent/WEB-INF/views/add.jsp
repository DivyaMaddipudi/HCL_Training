<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="customercontroller.do" method="post">
<input type="hidden" name="id" value="0" readonly>
	<table>
		<tr>
			<td>Enter name:</td>
			<td><input type="text" name="name"></td>
		</tr>
		
		<tr>
			<td>Enter address:</td>
			<td><textarea name="address" rows="10" cols="30"></textarea> </td>
		</tr>	
		
		<tr>
			<td>Enter email:</td>
			<td><input type="text" name="email"></td>
		</tr>
		
		<tr>
			<td>Enter phone:</td>
			<td><input type="text" name="phone"></td>
		</tr>
		
		<tr>
			<td>Enter dob:</td>
			<td><input type="text" name="dob"></td>
		</tr>
		
		<tr>
			<td>Enter purchage capacity:</td>
			<td><input type="text" name="purchage_capacity"></td>
		</tr>
		
		<tr>
			<td> <input type="submit" value="add"> </td>
		</tr>

	</table>
</form>
</body>
</html>