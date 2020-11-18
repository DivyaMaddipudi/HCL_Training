<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple calculator</title>
</head>
<body>
<br>
${error}
<form action="cal" method="post">
	Enter first No: <input type="text" name="value1"><br>
	Enter second No: <input type="text" name="value2"><br>
	<input type="submit"><br>
</form>
</body>
</html>