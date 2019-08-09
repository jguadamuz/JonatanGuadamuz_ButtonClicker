<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Clicker</title>

<style type="text/css">
body {
	margin: auto;
	width: 50%;
}
form {
    margin-top: 30px;
}
button {
    margin: auto;
    display: block;
    font-size: larger;
}
h1 {
    text-align: center;
}
</style>

</head>
<body>
	<form action="Counter" method="post">
		<button type="submit">Click Me!</button>
	</form>

	<h1>
		You have clicked this button <c:out value="${counter}"/>
		times
	</h1>
</body>
</html>
