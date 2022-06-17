<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="xxxxxxx" method="post" modelAttribute="account">
	<table>
		<tr>
			<td><form:label path="account">Account</form:label></td>
			<td><form:input path="account"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="password">password</form:label></td>
			<td><form:input path="password"></form:input></td>
		</tr>
		<tr>
			<td colspan="2"><form:button value="send">Send</form:button></td>
		</tr>
	</table>
</form:form>
</body>
</html>