<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.red {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/register/process"
		modelAttribute="admin">
    
        FirstName<form:input path="firstName" />
		<span><form:errors path="firstName" cssClass="red"></form:errors></span>
		<br>
        LastName<form:input path="lastName" />
		<span><form:errors path="lastName" cssClass="red"></form:errors></span>
		<br>
        Age<form:input path="age" />
		<span><form:errors path="age" cssClass="red"></form:errors></span>
		<br>
        Gender<form:input path="gender" />
		<span><form:errors path="gender" cssClass="red"></form:errors></span>
		<br>
        ContactNumber<form:input path="contactNumber" />
		<span><form:errors path="contactNumber" cssClass="red"></form:errors></span>
		<br>
        VendorId<form:input path="vendorId" />
		<span><form:errors path="vendorId" cssClass="red"></form:errors></span>
		<br>
        Password<form:input path="password" />
		<span><form:errors path="password" cssClass="red"></form:errors></span>
		<br>

		<input type="submit" value="Submit">
	</form:form>
</body>
</html>