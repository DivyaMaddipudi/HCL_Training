<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<br>
<h3>Welcome user, ${sessionScope.accountNumber} </h3>
<h4><a href="logout">logout</a></h4> <br>
<a href="getTransactions">Transfer Amount</a> <br>
<a href="checkBalance">Check Balance</a> <br>
<c:if test="${balance != null}">
	Balance in your account is ${balance}
</c:if>

</body>
</html>