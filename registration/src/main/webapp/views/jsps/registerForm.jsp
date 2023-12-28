<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="register" method="POST" action="/submitForm">
		<table>
			<tr>
				<td>Student ID:</td>
				<td><form:input path="stdId" /></td>

			</tr>
			<tr>
				<td>Name:</td>
				<td><form:input path="stdName" /><form:errors>Please enter value</form:errors></td>

			</tr>
			<tr>
				<td>Gender:</td>
				<td><form:input path="stdGender" /><form:errors>Please enter value</form:errors></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="stdEmail" /><form:errors>Please enter value</form:errors></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><form:input path="stdPhno" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>