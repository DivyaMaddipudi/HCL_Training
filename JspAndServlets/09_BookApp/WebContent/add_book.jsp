<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add book</title>
</head>
<body>
	
	<form action="bookController" method="post">
	<input type="hidden" name="id"><br>
	<table>
		<tr>
			<td>Enter isbn: </td>
			<td><input type="text" name="isbn"> </td>
		</tr>
		
		<tr>
			<td>Enter title: </td>
			<td><input type="text" name="title"> </td>
		</tr>
		
		<tr>
			<td>Enter author: </td>
			<td><input type="text" name="author"> </td>
		</tr>
		
		<tr>
			<td>Enter publish date: </td>
			<td><input type="text" name="date"> </td>
		</tr>
		
		<tr>
			<td>Enter price: </td>
			<td><input type="text" name="price"> </td>
		</tr>
		
		<tr>
			<td><input type="submit" value="add book"> </td>
		</tr>
	
	</table>
	</form>

</body>
</html>