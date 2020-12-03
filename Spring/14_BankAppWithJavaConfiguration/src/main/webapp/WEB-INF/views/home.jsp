<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<style type="text/css">

h3 {
	color:orange;
}

a {
 text-decoration:none,
}
</style>

</head>
<body>
<br>
<h3>Hello, ${sessionScope.user.userType}</h3>  <br>
<c:if test="${sessionScope.user.userType == 'Admin'}">
	<h4><a href="adduser"> Add User </a></h4>
	<h4><a href="addaccount"> Add Account</a></h4>
	<h4><a href="showallaccounts">Show All Accounts</a></h4>
	<h4><a href="showallusers">Show All Users</a></h4>
	<h4><a href="transfer"> Transfer</a></h4>
	<h4><a href="withdraw"> Withdraw</a></h4>
	<h4><a href="deposit"> Deposit</a></h4>
	<h4><a href="logout"> Logout</a></h4>
</c:if>

<c:if test="${sessionScope.user.userType == 'Mgr'}">
	<h4><a href="showallaccounts">Show All Accounts</a></h4>
	<h4><a href="showallusers">Show All Users</a></h4>
	<h4><a href="transfer"> Transfer</a></h4>
	<h4><a href="withdraw"> Withdraw</a></h4>
	<h4><a href="deposit"> Deposit</a></h4>
	<h4><a href="logout"> Logout</a></h4>
	</c:if>
<c:if test="${sessionScope.user.userType == 'Clerk'}">
	<h4><a href="showallaccounts">Show All Accounts</a></h4>
	<h4><a href="transfer"> Transfer</a></h4>
	<h4><a href="withdraw"> Withdraw</a></h4>
	<h4><a href="deposit"> Deposit</a></h4>
	<h4><a href="logout"> Logout</a></h4>
</c:if>
</body>
</html>